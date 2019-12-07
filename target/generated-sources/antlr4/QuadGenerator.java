  import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class QuadGenerator extends sjBaseListener {
	
    private LinkedList<String> stack = new LinkedList<>();
    private ArrayList<Quad> quads = new ArrayList<>();
    private int cptTemps = 0;
    EvaluateListener evaluator;

    public QuadGenerator(EvaluateListener evaluator) {
        this.evaluator = evaluator;
    }


    @Override public void exitProgram(sjParser.ProgramContext ctx)
    {
        if(evaluator.getErrors().size()>0)
            return;
        quads.add(new Quad("END","","",""));
        System.out.println("Generated quads:\n");;
        System.out.println("------------------------------------------------");
        for (int i = 0; i < quads.size(); i++) {
        	System.out.println("\n" + i + ": " + quads.get(i).toString());
        }
        System.out.println("\n------------------------------------------------");
    }	

}
