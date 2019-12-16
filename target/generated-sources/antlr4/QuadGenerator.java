

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class QuadGenerator extends sjBaseListener {
	
	private LinkedList<String> stack = new LinkedList<>();
    private Stack<Integer> tmpStack = new Stack<Integer>(){{push(0);}};	
    private ArrayList<Quad> quads = new ArrayList<>();
    private int qc = 0;
    private int saveCond;
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
    
    /*@Override public void exitAssignment(sjParser.AssignmentContext ctx) {
    	
        System.out.println("\nexitAssignment start: " +" head of stack is " + stack.getLast());
        String t = stack.removeLast();
        quads.add(new Quad(":=",t,"",ctx.ID().getText()));
        System.out.println("\nexitAssignment adding quad " + quads.get(quads.size()-1));    	
    		
    }	*/
    
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
