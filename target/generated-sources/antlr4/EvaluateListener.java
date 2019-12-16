import java.util.LinkedList;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.HashMap;

public class EvaluateListener extends sjBaseListener{
	
    private static final int DECLARED = 1;
    private static final int UNDECLARED = 2;
    private static final int FLOAT = 2;
    private static final int INT = 1;
    private static final int STRING = 3;    

    SymbolTable table = new SymbolTable();
    private LinkedList<String> errors = new LinkedList<>();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();
    private int lang = 0;
    private int io = 0;
    
    public LinkedList<String> getErrors() {
        return errors;
    }    
    
    @Override public void exitProgram(sjParser.ProgramContext ctx)
    {
    	if(!Character.isUpperCase(ctx.klass().ID().getText().charAt(0))) {
    		errors.add("Class name must start with a capital letter !");
    	}
    	
        if(errors.size() == 0) { // no errors
            System.out.println("Program compiled without errors!");
            System.out.println("\nsymbols table: ");
            System.out.println("******************************************************");
            for (int i = 0; i < table.getSize(); i++) {
            	System.out.println("\n" + table.getSymbol(i).toString());
            }
            System.out.println("******************************************************");
        }
        else
        {
            System.out.println("Program compiled with the following errors :");
            for (int i = 0; i < errors.size(); i++) {
                System.out.println("\n" + errors.get(i));
            }
        }
    }
    
    @Override public void exitVarDec(sjParser.VarDecContext ctx)
    {
    	int type = 0;
    	if(ctx.type() != null){
    	if(ctx.type().getText().equals("int_sj")) {
    		type = 1;
    	}
    	else if(ctx.type().getText().equals("float_sj")) {
    		type = 2;
    	}
    	else
    		type = 3;
    	}

        sjParser.VariablesContext vars = ctx.variables() ;

        for (;;vars = vars.variables()) // loop over variables
        {
            String varName = vars.getChild(0).getText();
            if(table.containsSymbol(varName)) {
                errors.add("Double declaration of variable: " + varName);
            }
            else
                table.addSymbol(new SymbolTable.Symbol(varName,DECLARED,type,1));
            if(vars.variables() == null)
                return;
        }
        
    }

    @Override public void exitLibraries(sjParser.LibrariesContext ctx) {
    	
    	String bibname = ctx.bibname().getText();
    	
    	if(bibname.equals("small_java.lang"))
    		lang = 1;
    	else if(bibname.equals("small_java.io"))
    		io = 1;
    	else
    		errors.add("No such library name : " + bibname);
	
    }
    
    @Override public void exitExpr(sjParser.ExprContext ctx)
    {
        if(ctx.expr() == null) {
        	
            addCtxType(ctx,getCtxType(ctx.t()));
        }
        else
        {
            System.out.println(ctx.t().getText() + " type: " + getCtxType(ctx.t()) + " and " + ctx.expr().getText() + " type: " + getCtxType(ctx.expr()));
            if(typesCompatible(getCtxType(ctx.t()),getCtxType(ctx.expr())))
                addCtxType(ctx,getResultingType(getCtxType(ctx.t()),getCtxType(ctx.expr())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                System.out.println("incompatible type between " + ctx.t().getText() + " and " + ctx.expr().getText());
                System.out.println(ctx.t().getText() + " type: " + getCtxType(ctx.t()) + " and " + ctx.expr().getText() + " type: " + getCtxType(ctx.expr()));
            }

        }
    }
    
    @Override public void exitEndEx(sjParser.EndExContext ctx)
    {
        if(ctx.ID() != null)
            addCtxType(ctx,table.getSymbol(ctx.ID().getText()).type);
        else if(ctx.expr() != null)
            addCtxType(ctx,getCtxType(ctx.expr()));
        else
            addCtxType(ctx,getCtxType(ctx.terminal()));
    }
    
    @Override public void exitT(sjParser.TContext ctx)
    {
        if(ctx.t() == null)
            addCtxType(ctx,getCtxType(ctx.endEx()));
        else
        {
            System.out.println(ctx.t().getText() + " type: " + getCtxType(ctx.t()) + " and " + ctx.endEx().getText() + " type: " + getCtxType(ctx.endEx()));
            if(typesCompatible(getCtxType(ctx.endEx()),getCtxType(ctx.t())))
                addCtxType(ctx,getResultingType(getCtxType(ctx.t()),getCtxType(ctx.endEx())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                System.out.println("incompatible type between " + ctx.t().getText() + " and " + ctx.endEx().getText());
                System.out.println(ctx.t().getText() + " type: " + getCtxType(ctx.t()) + " and " + ctx.endEx().getText() + " type: " + getCtxType(ctx.endEx()));
            }
        }
    }    
    
    @Override public void exitAssignment(sjParser.AssignmentContext ctx) {
    	
    	if(lang == 1) {
    	
    	String id = ctx.ID().getText();
    	if(!table.containsSymbol(id)) {
    		errors.add("Variable " + id + " has not been declared");
    		table.addSymbol(new SymbolTable.Symbol(id,UNDECLARED,INT|FLOAT,1));
    		// to not generate the same error
    	}
        if(!typesCompatible(getCtxType(ctx.expr()),table.getSymbol(id).type)) {
            errors.add("Incompatible types in affectation " + ctx.getText());
        	clearMap();
        }
        
    	}
    	else {
    		errors.add("Library small_java.lang is not defined !");
    	}
    	
    }	
    
    @Override public void exitIf_statement(sjParser.If_statementContext ctx) {
    	
    	if(lang == 0) {
    		errors.add("Library small_java.lang is not defined !");    		
    	}
    	
    }
    
    @Override public void exitOutput(sjParser.OutputContext ctx) {
    	
    	if(io == 0) {
    		errors.add("Library small_java.io is not defined !");
    		
    	}
    	
    }
    
    @Override public void exitVarText(sjParser.VarTextContext ctx) {
    	
    	String text = ctx.TEXT().getText();
    	String ID = ctx.ID().getText();
    	
    	if(!table.containsSymbol(ID)) {
    		errors.add("Variable " + ID + " has not been declared");
    		table.addSymbol(new SymbolTable.Symbol(ID,UNDECLARED,INT|FLOAT|STRING,1));
    		// to not generate the same error
    	}
    	else {
    		if(table.getSymbol(ID).type == INT) {
    			if(!text.contains("%d")) {
    				errors.add("Incompatible type conversion ! " + ID + " is of type INT");
    			}
    		}
    		if(table.getSymbol(ID).type == FLOAT) {
    			if(!text.contains("%f")) {
    				errors.add("Incompatible type conversion ! " + ID + " is of type FLOAT");
    			}
    		}
    		if(table.getSymbol(ID).type == STRING) {
    			if(!text.contains("%s")) {
    				errors.add("Incompatible type conversion ! " + ID + " is of type STRING");
    			}
    		}     		
    	}
    	
    	
    }    
    
    @Override public void exitInput(sjParser.InputContext ctx) {
    	
    	String ID = ctx.ID().getText();
    	
    	if(io == 0) {
    		errors.add("Library small_java.io is not defined !");   		
    	}
    	if(!table.containsSymbol(ID)) {
    		errors.add("Variable " + ID + " has not been declared");
    		table.addSymbol(new SymbolTable.Symbol(ID,UNDECLARED,INT|FLOAT|STRING,1));
    		// to not generate the same error
    	}
    	else {
    		if(ctx.format().getText().equals("int_sj")) {
    			if(table.getSymbol(ID).type != INT) {
    				errors.add("Incompatible types conversion for variable : " + ID);
    			}

    		}
    		if(ctx.format().getText().equals("float_sj")) {
    			if(table.getSymbol(ID).type != FLOAT) {
    				errors.add("Incompatible types conversion for variable : " + ID);
    			}
    		}
    		if(ctx.format().getText().equals("string_sj")) {
    			if(table.getSymbol(ID).type != STRING) {
    				errors.add("Incompatible types conversion for variable : " + ID);
    			}
    		}
    		
    	}
    	
    }
    
    @Override public void exitTerminal(sjParser.TerminalContext ctx) {
    	
    	if(ctx.ID() != null) {
    		addCtxType(ctx,table.getSymbol(ctx.ID().getText()).type);
    	}
    	else if(ctx.STRING() != null) {
    		addCtxType(ctx,STRING);    		
    	}
    	else if(ctx.INT() != null) {
    		addCtxType(ctx,INT);    		
    	}
    	else if(ctx.FLOAT() != null) {
    		addCtxType(ctx,FLOAT);
    	}
    	
    }
    
    
    
    private static boolean typesCompatible(int t1,int t2)
    {
        return (t1 & t2) != 0;
    }
    
    private void clearMap()
    {
        types.clear();
    }
    
    private int getCtxType(ParserRuleContext ctx) {

        return types.get(ctx);
    }
    
    private void addCtxType(ParserRuleContext ctx, int type)
    {
        types.put(ctx,type);
    }    
    private static int getResultingType(int t1,int t2)
    {
        return ((t1 & t2 & INT) != 0)?INT:FLOAT;
    }
    
}
