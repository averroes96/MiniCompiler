import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	
    	CharStream codePointCharStream = CharStreams.fromFileName("C:\\Users\\med\\eclipse-workspace\\MiniComp\\src\\test.averroes");    	
        averroesLexer lexer = new averroesLexer(codePointCharStream);
        averroesParser parser = new averroesParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.program();
        EvaluateVisitor visitor = new EvaluateVisitor();
        visitor.visit(tree);
        
    }
}
