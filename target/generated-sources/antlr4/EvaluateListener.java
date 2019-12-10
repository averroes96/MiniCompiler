import java.util.LinkedList;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.HashMap;

public class EvaluateListener extends sjBaseListener{
	
    private static final int DECLARED = 1;
    private static final int UNDECLARED = 2;
    private static final int FLOAT = 2;
    private static final int INT = 1;
    private static final int STRING = 3;    

    private SymbolTable table = new SymbolTable();
    private LinkedList<String> errors = new LinkedList<>();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();
    private int lang = 0;
    private int io = 0;
    
    public LinkedList<String> getErrors() {
        return errors;
    }    
    
    @Override public void exitProgram(sjParser.ProgramContext ctx)
    {
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
    	int type;
    	if(ctx.type().getText().equals("int_sj")) {
    		type = 1;
    	}
    	else if(ctx.type().getText().equals("float_sj")) {
    		type = 2;
    	}
    	else
    		type = 3;

        sjParser.VariablesContext vars = ctx.variables() ;

        for (;;vars = vars.variables()) // loop over vars
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
    		System.exit(0);
    	}
    	
    }
    
    @Override public void exitIf_statement(sjParser.If_statementContext ctx) {
    	
    	if(lang == 0) {
    		errors.add("Library small_java.lang is not defined !");
    		System.exit(0);    		
    	}
    	
    }
    
    @Override public void exitOutput(sjParser.OutputContext ctx) {
    	
    	if(io == 0) {
    		errors.add("Library small_java.io is not defined !");
    		System.exit(0);    		
    	}
    	
    }
    
    @Override public void exitInput(sjParser.InputContext ctx) {
    	
    	String ID = ctx.ID().getText();
    	
    	if(io == 0) {
    		errors.add("Library small_java.io is not defined !");
    		System.exit(0);    		
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
    
    
    
    private static boolean typesCompatible(int t1,int t2)
    {
        return (t1 & t2) != 0;
    }
    
    private void clearMap()
    {
        types.clear();
    }
    
    private int getCtxType(ParserRuleContext ctx)
    {
        return types.get(ctx);
    }    

    
}
