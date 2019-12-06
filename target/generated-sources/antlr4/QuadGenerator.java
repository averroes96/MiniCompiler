
public class QuadGenerator extends averroesBaseVisitor<Value> {
	
    @Override public Value exitProg(averroesParser.ProgramContext ctx)
    {
        if(semanticErrorCheck.getErrors().size()>0)
            return;
        quads.addQuad("END","","","");
        showText("generated quads: ",TextDisplayer.COMPILERTEXTS);
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);
        for (int i = 0; i < quads.size(); i++) {
            showText(i + ": " + quads.getQuad(i).toString(),TextDisplayer.COMPILERTEXTS);
        }
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);
    }
	

}
