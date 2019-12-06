import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EvaluateVisitor extends averroesBaseVisitor<Value> {
	
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    // assignment/id overrides
    @Override
    public Value visitAssignment(averroesParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }
    
    @Override
    public Value visitIdAtom(averroesParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("No such variable: " + id);
        }
        return value;
    }
    
    @Override
    public Value visitStringAtom(averroesParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }
    
    @Override
    public Value visitNumberAtom(averroesParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }
    
    @Override
    public Value visitBooleanAtom(averroesParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }
    
    @Override
    public Value visitNilAtom(averroesParser.NilAtomContext ctx) {
        return new Value(null);
    }
    
    @Override
    public Value visitParExpr(averroesParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }
    
    @Override
    public Value visitPowExpr(averroesParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }
    
    @Override
    public Value visitUnaryMinusExpr(averroesParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }
    
    @Override
    public Value visitNotExpr(averroesParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }
    
    @Override
    public Value visitMultiplicationExpr(@NotNull averroesParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case averroesParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case averroesParser.DIV:
            	if(right.asDouble() == 0.00) {
                    throw new RuntimeException("Division by Zero Exception at line");            		
            	}            	
                return new Value(left.asDouble() / right.asDouble());
                
            case averroesParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("Unknown operator: " + averroesParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public Value visitAdditiveExpr(@NotNull averroesParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case averroesParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case averroesParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + averroesParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public Value visitRelationalExpr(@NotNull averroesParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case averroesParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case averroesParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case averroesParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case averroesParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("Unknown operator: " + averroesParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public Value visitEqualityExpr(@NotNull averroesParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case averroesParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case averroesParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("Unknown operator: " + averroesParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public Value visitAndExpr(averroesParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(averroesParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }
    
    @Override
    public Value visitOutput(averroesParser.OutputContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }
    
    // if override
    @Override
    public Value visitIf_statement(averroesParser.If_statementContext ctx) {

        List<averroesParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(averroesParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.statement_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.statement_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.statement_block());
        }

        return Value.VOID;
    }
    
    // while override
    @Override
    public Value visitWhile_statement(averroesParser.While_statementContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.statement_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }
    
    

}
