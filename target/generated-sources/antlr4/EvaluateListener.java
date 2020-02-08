import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class EvaluateListener extends sjBaseListener{
	
    private static final int DECLARED = 1;
    private static final int UNDECLARED = 2;
    private static final int FLOAT = 2;
    private static final int INT = 1;
    private static final int STRING = 3;
    private static final int KEYWORD = 4;

    SymbolTable table = new SymbolTable();
    public LinkedList<String> errors = new LinkedList<>();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();   
    
    public LinkedList<String> getErrors() {
        return errors;
    }    
    
    @Override public void exitProgram(sjParser.ProgramContext ctx)
    {

    	
        if(errors.size() == 0) { // no errors
            System.out.println("Program compiled without errors!");
            System.out.println("\n---------- Start generating Symbols table ----------\n");
            System.out.println("-----------------|----------|------------|");            
            System.out.println("       Var       |   Type   |   Status   |");
            System.out.println("-----------------|----------|------------|");
            for (int i = 0; i < table.getSize(); i++) {
            	System.out.println("\n" + table.getSymbol(i).toString());
            }
            System.out.println("\n---------- Finished generating Symbols table ----------");
            
           
        }
        else
        {
            System.out.println("\n\nProgram compiled with the following errors :-------------------------------");
            for (int i = 0; i < errors.size(); i++) {
                System.out.println("\n" + errors.get(i));
            }
        }
    }
    
    @Override public void exitKlass(sjParser.KlassContext ctx) {
    	
    	if(!Character.isUpperCase(ctx.ID().getText().charAt(0))) {
    		errors.add("Class name must start with a capital letter !");
    	}
    	
    	table.addSymbol(new SymbolTable.Symbol(ctx.ID().getText(),DECLARED,KEYWORD,1));    	
    	
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
                errors.add("Double declaration of variable: " + varName + " at Line : " + ctx.start.getLine());
            }
            else
                table.addSymbol(new SymbolTable.Symbol(varName,DECLARED,type,1));
            if(vars.variables() == null)
                return;
        }
        
    }

    @Override public void exitLibraries(sjParser.LibrariesContext ctx) {
    	
    	String bibname = ctx.bibname().getText();
    	
    	if(bibname.equals("small_java.lang") || bibname.equals("small_java.io"))
    		table.addSymbol(new SymbolTable.Symbol(bibname,DECLARED,KEYWORD,1));
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
            
            if(typesCompatible(getCtxType(ctx.t()),getCtxType(ctx.expr()))) {
            	
                addCtxType(ctx,getResultingType(getCtxType(ctx.t()),getCtxType(ctx.expr())));

            }
            else {
                addCtxType(ctx, 0);
                errors.add("incompatible type between " + ctx.t().getText() + " and " + ctx.expr().getText()+ " at Line : " + ctx.start.getLine());            }

        }
    }
    
    @Override public void exitEndExpr(sjParser.EndExprContext ctx)
    {
        if(ctx.ID() != null ) {
        	if(table.containsSymbol(ctx.ID().getText()))
            addCtxType(ctx,table.getSymbol(ctx.ID().getText()).type);
        	else {
        	addCtxType(ctx,-1);
        	errors.add("Variable " + ctx.ID().getText() + " is undefined at line : " + ctx.start.getLine());
        	}

        }
        else if(ctx.expr() != null) {
            addCtxType(ctx,getCtxType(ctx.expr()));
        	System.out.println("it's endExpr expr");
        }
        else {
            addCtxType(ctx,getCtxType(ctx.terminal()));
        }
    }
    
    @Override public void exitT(sjParser.TContext ctx)
    {
        if(ctx.t() == null) {
            addCtxType(ctx,getCtxType(ctx.endExpr()));

        }
        else
        {
            if(typesCompatible(getCtxType(ctx.endExpr()),getCtxType(ctx.t()))) {
                addCtxType(ctx,getResultingType(getCtxType(ctx.t()),getCtxType(ctx.endExpr())));            	
            }
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                errors.add("incompatible type between " + ctx.t().getText() + " and " + ctx.endExpr().getText() + " at Line : " + ctx.start.getLine());
            }
        }
    }    
    
    @Override public void exitAssignment(sjParser.AssignmentContext ctx) {
    	
    	ParserRuleContext expr = ctx.expr();
    	
    	if(table.containsSymbol("small_java.lang")) {
    	
    	String id = ctx.ID().getText();
    	if(!table.containsSymbol(id)) {
    		errors.add("Variable " + id + " has not been declared" + " at Line : " + ctx.start.getLine());
    		table.addSymbol(new SymbolTable.Symbol(id,UNDECLARED,INT|FLOAT,1));
    		// to not generate the same error
    	}
        if(!typesCompatible(getCtxType(ctx.expr()),table.getSymbol(id).type)) {
            errors.add("Incompatible types in affectation " + ctx.getText());
        	clearMap();
        }

        
    	}
    	else {
    		errors.add("Library small_java.lang is not defined !" + " at Line : " + ctx.start.getLine());
    	}
    	
    }	
    
    @Override public void exitIf_statement(sjParser.If_statementContext ctx) {
    	
    	if(!table.containsSymbol("small_java.lang")) {
    		errors.add("Library small_java.lang is not defined !" + " at Line : " + ctx.start.getLine());    		
    	}
    	
    }
    
    @Override public void exitOutput(sjParser.OutputContext ctx) {
    	
    	if(!table.containsSymbol("small_java.io")) {
    		errors.add("Library small_java.io is not defined !" + " at Line : " + ctx.start.getLine());
    		
    	}
    	
    }
    
    @Override public void exitVarText(sjParser.VarTextContext ctx) {
    	
    	String text = ctx.TEXT().getText();
    	List<TerminalNode> ids = ctx.ID() ;
    	ArrayList<String> varType = new ArrayList<>();
    	int cpt1=0;
    	
    	for(int i = 0; i < text.length()-1; i++) {
    		if(text.charAt(i) == '%' && ( text.charAt(i+1) == 'd' || text.charAt(i+1) == 's' || text.charAt(i+1) == 'f')) {
    				cpt1++;
    				varType.add("%" + text.charAt(i+1));
    		}
    	}
    	
    	
    	
    	if( cpt1 == ids.size() ) {
    		
    		for(int i = 0; i < ids.size(); i++) {
    		
    		String ID = ids.get(i).getText();	
    			
	    	if(!table.containsSymbol(ID)) {
	    		errors.add("Variable " + ID + " has not been declared" + " at Line : " + ctx.start.getLine());
	    		table.addSymbol(new SymbolTable.Symbol(ID,UNDECLARED,INT|FLOAT|STRING,1));
	    		// to not generate the same error
	    	}
	    	else {
	    		if(table.getSymbol(ID).type == INT) {
	    			if(!varType.get(i).equals("%d")) {
	    				errors.add("Incompatible type conversion ! " + ID + " is of type INT" + " at Line : " + ctx.start.getLine());
	    			}
	    		}
	    		if(table.getSymbol(ID).type == FLOAT) {
	    			if(!varType.get(i).equals("%f")) {
	    				errors.add("Incompatible type conversion ! " + ID + " is of type FLOAT" + " at Line : " + ctx.start.getLine());
	    			}
	    		}
	    		if(table.getSymbol(ID).type == STRING) {
	    			if(!varType.get(i).equals("%s")) {
	    				errors.add("Incompatible type conversion ! " + ID + " is of type STRING"+ " at Line : " + ctx.start.getLine());
	    			}
	    		}
	    	}
    		}
    	}
    	else
    		errors.add("Number of defined parameters does not equal number of given variables at line : " + ctx.start.getLine());
    }    
    
    @Override public void exitInput(sjParser.InputContext ctx) {
    	
    	String ID = ctx.ID().getText();
    	
    	if(!table.containsSymbol("small_java.lang")) {
    		errors.add("Library small_java.io is not defined !" + " at Line : " + ctx.start.getLine());   		
    	}
    	if(!table.containsSymbol(ID)) {
    		errors.add("Variable " + ID + " has not been declared" + " at Line : " + ctx.start.getLine());
    		table.addSymbol(new SymbolTable.Symbol(ID,UNDECLARED,INT|FLOAT|STRING,1));
    		// to not generate the same error
    	}
    	else {
    		if(ctx.format().getText().equals("int_sj")) {
    			if(table.getSymbol(ID).type != INT) {
    				errors.add("Incompatible types conversion for variable : " + ID + " at Line : " + ctx.start.getLine());
    			}

    		}
    		if(ctx.format().getText().equals("float_sj")) {
    			if(table.getSymbol(ID).type != FLOAT) {
    				errors.add("Incompatible types conversion for variable : " + ID+ " at Line : " + ctx.start.getLine());
    			}
    		}
    		if(ctx.format().getText().equals("string_sj")) {
    			if(table.getSymbol(ID).type != STRING) {
    				errors.add("Incompatible types conversion for variable : " + ID+ " at Line : " + ctx.start.getLine());
    			}
    		}
    		
    	}
    	
    }
    
    @Override public void exitTerminal(sjParser.TerminalContext ctx) {
    	
    	if(ctx.ID() != null) {
    		addCtxType(ctx,table.getSymbol(ctx.ID().getText()).type);   		
    	}
    	else if(ctx.TEXT() != null) {
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
        if((t1 & t2 & INT) != 0)
        	return INT ;
        if((t1 & t2 & STRING) != 0)
        	return STRING ;
        else
        	return FLOAT ;
    }
    
}
