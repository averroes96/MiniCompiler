  import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class QuadGenerator extends sjBaseListener {
	
	private LinkedList<String> stack = new LinkedList<>();
    private ArrayList<Quad> quads = new ArrayList<>();
    private int qc = 0;
    private static int iterator = 0 ;    
    EvaluateListener evaluator;

    public QuadGenerator(EvaluateListener evaluator) {
        this.evaluator = evaluator;
    }


    @Override public void exitProgram(sjParser.ProgramContext ctx)
    {
        if(evaluator.getErrors().size()>0)
            return;
        quads.add(new Quad("END","","",""));
        System.out.println("\nGenerated quads:\n");;
        System.out.println("------------------------------------------------");
        for (int i = 0; i < quads.size(); i++) {
        	System.out.println("\n" + i + ": " + quads.get(i).toString());
        }
        System.out.println("\n------------------------------------------------");
    }
    
    @Override public void exitAssignment(sjParser.AssignmentContext ctx) {
    	
        System.out.println("\nexitAssignment start: " +" head of stack is " + stack.getLast());
        String t = stack.removeLast();
        quads.add(new Quad(":=",t,"",ctx.ID().getText()));
        System.out.println("\nexitAssignment adding quad " + quads.get(quads.size()-1));    	
    		
    }

    @Override public void exitMultiplicationExpr(sjParser.MultiplicationExprContext ctx) {
    	
        String right = stack.pop();
        String left = stack.pop();
        String t = "temp" + iterator++;
        switch(ctx.op.getType()) {
        case sjParser.MULT : quads.add(new Quad("*",left,right,t )); break;
        case sjParser.DIV : quads.add(new Quad("/",left,right,t )); break;
        case sjParser.MOD : quads.add(new Quad("%",left,right,t )); break;
        default :
        	throw new RuntimeException("Unknown operator: " + sjParser.tokenNames[ctx.op.getType()]);
        	
        }
        this.stack.push(t);
        System.out.println("exitExp adding quad : " + quads.get(quads.size()-1));        
    }
    
    @Override public void exitAdditiveExpr(sjParser.AdditiveExprContext ctx) {
        String right = stack.pop();
        String left = stack.pop();
        String t = "temp" + iterator++;
        switch(ctx.op.getType()) {
        
        case sjParser.PLUS : quads.add(new Quad("+",left,right,t )); break;
        case sjParser.DIV : quads.add(new Quad("-",left,right,t )); break;
        default :
        	throw new RuntimeException("Unknown operator: " + sjParser.tokenNames[ctx.op.getType()]);
        
        
        }
        this.stack.push(t);
        System.out.println("exitExp adding quad : " + quads.get(quads.size()-1));        
    }    
    
 

}
