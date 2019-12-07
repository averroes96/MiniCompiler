import java.util.LinkedList;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.HashMap;

public class EvaluateListener extends sjBaseListener{
	
    private static final int DECLARED = 1;
    private static final int UNDECLARED = 2;
    private static final int FLOAT = 2;
    private static final int INT = 1;

    private SymbolTable table = new SymbolTable();
    private LinkedList<String> errors = new LinkedList<>();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();
    
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

        
    
    

}
