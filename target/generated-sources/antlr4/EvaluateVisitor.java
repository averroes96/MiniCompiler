import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

public class EvaluateVisitor extends sjBaseVisitor<SJValue> {
	
    public static final double SMALL_SJValue = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, SJValue> memory = new HashMap<String, SJValue>();

    // assignment/id overrides
    @Override
    public SJValue visitAssignment(sjParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        SJValue SJValue = this.visit(ctx.expr());
        return memory.put(id, SJValue);
    }
    
    @Override
    public SJValue visitIdAtom(sjParser.IdAtomContext ctx) {
        String id = ctx.getText();
        SJValue SJValue = memory.get(id);
        if(SJValue == null) {
            throw new RuntimeException("No such variable: " + id);
        }
        return SJValue;
    }
    
    @Override
    public SJValue visitStringAtom(sjParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new SJValue(str);
    }
    
    @Override
    public SJValue visitNumberAtom(sjParser.NumberAtomContext ctx) {
        return new SJValue(Double.valueOf(ctx.getText()));
    }
    
    @Override
    public SJValue visitBooleanAtom(sjParser.BooleanAtomContext ctx) {
        return new SJValue(Boolean.valueOf(ctx.getText()));
    }
    
    @Override
    public SJValue visitNilAtom(sjParser.NilAtomContext ctx) {
        return new SJValue(null);
    }
    
    @Override
    public SJValue visitParExpr(sjParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }
    
    @Override
    public SJValue visitPowExpr(sjParser.PowExprContext ctx) {
        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));
        return new SJValue(Math.pow(left.asDouble(), right.asDouble()));
    }
    
    @Override
    public SJValue visitUnaryMinusExpr(sjParser.UnaryMinusExprContext ctx) {
        SJValue SJValue = this.visit(ctx.expr());
        return new SJValue(-SJValue.asDouble());
    }
    
    @Override
    public SJValue visitNotExpr(sjParser.NotExprContext ctx) {
        SJValue SJValue = this.visit(ctx.expr());
        return new SJValue(!SJValue.asBoolean());
    }
    
    @Override
    public SJValue visitMultiplicationExpr(@NotNull sjParser.MultiplicationExprContext ctx) {

        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case sjParser.MULT:
                return new SJValue(left.asDouble() * right.asDouble());
            case sjParser.DIV:
            	if(right.asDouble() == 0.00) {
                    throw new RuntimeException("Division by Zero Exception at line");            		
            	}            	
                return new SJValue(left.asDouble() / right.asDouble());
                
            case sjParser.MOD:
                return new SJValue(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("Unknown operator: " + sjParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public SJValue visitAdditiveExpr(@NotNull sjParser.AdditiveExprContext ctx) {

        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case sjParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new SJValue(left.asDouble() + right.asDouble()) :
                        new SJValue(left.asString() + right.asString());
            case sjParser.MINUS:
                return new SJValue(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + sjParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public SJValue visitRelationalExpr(@NotNull sjParser.RelationalExprContext ctx) {

        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case sjParser.LT:
                return new SJValue(left.asDouble() < right.asDouble());
            case sjParser.LTEQ:
                return new SJValue(left.asDouble() <= right.asDouble());
            case sjParser.GT:
                return new SJValue(left.asDouble() > right.asDouble());
            case sjParser.GTEQ:
                return new SJValue(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("Unknown operator: " + sjParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public SJValue visitEqualityExpr(@NotNull sjParser.EqualityExprContext ctx) {

        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case sjParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new SJValue(Math.abs(left.asDouble() - right.asDouble()) < SMALL_SJValue) :
                        new SJValue(left.equals(right));
            case sjParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new SJValue(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_SJValue) :
                        new SJValue(!left.equals(right));
            default:
                throw new RuntimeException("Unknown operator: " + sjParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public SJValue visitAndExpr(sjParser.AndExprContext ctx) {
        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));
        return new SJValue(left.asBoolean() && right.asBoolean());
    }

    @Override
    public SJValue visitOrExpr(sjParser.OrExprContext ctx) {
        SJValue left = this.visit(ctx.expr(0));
        SJValue right = this.visit(ctx.expr(1));
        return new SJValue(left.asBoolean() || right.asBoolean());
    }
    

    // if override
    
    /*
    @Override
    public SJValue visitIf_statement(sjParser.If_statementContext ctx) {

        List<sjParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(sjParser.Condition_blockContext condition : conditions) {

            SJValue evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.statement_block());
                break;
            }
        }	

        if(!evaluatedBlock && ctx.statement_block() != null) {
            this.visit(ctx.statement_block(0));
        }

        return SJValue.VOID;
    }	*/

}
