import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		sjLexer lexer = new sjLexer(new ANTLRFileStream("src\\algo.sj"));
		
		sjParser parser = new sjParser(new CommonTokenStream(lexer));
		
		EvaluateListener eval = new EvaluateListener();
		QuadGenerator quadGen = new QuadGenerator(eval);
		
		parser.setBuildParseTree(true);
		 
        parser.addParseListener(eval);
        parser.addParseListener(quadGen);
        
        parser.program();        
		
	}

}
