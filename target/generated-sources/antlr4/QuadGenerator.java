

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;


public class QuadGenerator extends sjBaseListener {
	
	private LinkedList<String> stack = new LinkedList<>();
	private static HashMap<String,String> breaks = new HashMap<>();
    private ArrayList<Quad> quads = new ArrayList<>();
    LinkedList<ObjectCode.Instruction> genInstructions ;
    private int saveCond;
    private static int iterator = 0 ;    
    EvaluateListener evaluator;

    public QuadGenerator(EvaluateListener evaluator) {
    	
    	breaks.put("<", "BGE");
    	breaks.put(">", "BLE");
    	breaks.put("<=", "BG");
    	breaks.put(">=", "BL");
    	breaks.put("=", "BNE");
    	breaks.put("!=", "BE");
    	
        this.evaluator = evaluator;
    }
    
    private static String getBreak(String str) {
    	
    	return breaks.get(str);
    	
    }


    @Override public void exitProgram(sjParser.ProgramContext ctx)
    {
        if(evaluator.getErrors().size()>0)
            return;
        quads.add(new Quad("END","","",""));
        System.out.println("\nStart generating quads: ------------------------------------------------");;
        for (int i = 0; i < quads.size(); i++) {
        	System.out.println("\nQ" + i + ": " + quads.get(i).toString());
        }
        System.out.println("\nFinished generating quads------------------------------------------------\n");   
        
        genInstructions = new ObjectCode(quads).generateCode();
    }
    
    @Override public void exitAssignment(sjParser.AssignmentContext ctx) {
    	
    	if(!stack.isEmpty()) {

        System.out.println("\nexitAssignment start: " +" head of stack is " + stack.getLast());
        String t = stack.removeLast();
        quads.add(new Quad(":=",t,"",ctx.ID().getText()));
        System.out.println("\nexitAssignment adding quad " + quads.get(quads.size()-1));
    	}
    		
    }
    
    @Override public void exitExpr(sjParser.ExprContext ctx)
    {
        if(ctx.expr() != null)
        {
            String t1 = stack.removeLast();
            String t2 = stack.removeLast();
            String temp = "Temp"+(++iterator);

            quads.add(new Quad(ctx.op1().getText(),t2,t1,temp));
            
            stack.add(temp);
        }
    }

    @Override public void exitT(sjParser.TContext ctx)
    {
        if(ctx.t() != null)
        {
        	if(!stack.isEmpty()) {
            String t1 = stack.removeLast(),t2 = stack.removeLast();
            String temp = "Temp"+(++iterator);
            if(ctx.op2() != null) {
            	quads.add(new Quad(ctx.op2().getText(),t2,t1,temp));
            	if(ctx.op2().getText().equals("/")) {
            		if(Integer.parseInt(t1) == 0) {
            			evaluator.errors.add("Division by zero at line : " + ctx.start.getLine());
            		}
            	}
            }
            stack.add(temp);
            System.out.println("exitT adding quad " + quads.get(quads.size()-1));
        	}
        }
        else
        {
            System.out.println("exitT head of stack is: " + stack.getLast() + " stack size " + stack.size());
        }
    }

    @Override public void exitEndExpr(sjParser.EndExprContext ctx)
    {
        if(ctx.expr() == null) {
            stack.add(ctx.getText());
            System.out.println("exitEndExpr: case exp == null adding "+ ctx.getText());
        }
        else
        {
            System.out.println("exitEndExpr: case exp = null adding nothing "+ stack.getLast());
        }
    }    
    
    @Override public void exitComparaison(sjParser.ComparaisonContext ctx) {
    	
    	
        System.out.println("exitComparaison start: " +" head of stack is " + stack.getLast());
        String t1 = stack.removeLast();
        String t2 = stack.removeLast();
        quads.add(new Quad(getBreak(ctx.operator().getText()),t2,t1,""));
        saveCond = quads.size()-1;
        System.out.println("exitComparaison adding quad " + quads.get(quads.size()-1));
    }
    
    @Override public void exitEls(sjParser.ElsContext ctx)
    {
        quads.get(saveCond).set(3,""+(quads.size()+1));
        quads.add(new Quad("BR","","",""));
        saveCond = quads.size()-1;
        
    }    
    
    @Override public void exitIf_statement(sjParser.If_statementContext ctx) {
    	
    	quads.get(saveCond).set(3, ""+quads.size());
    	
    }
}
