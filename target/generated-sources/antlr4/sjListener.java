// Generated from sj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sjParser}.
 */
public interface sjListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sjParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(sjParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(sjParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#libraries}.
	 * @param ctx the parse tree
	 */
	void enterLibraries(sjParser.LibrariesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#libraries}.
	 * @param ctx the parse tree
	 */
	void exitLibraries(sjParser.LibrariesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#main_sj}.
	 * @param ctx the parse tree
	 */
	void enterMain_sj(sjParser.Main_sjContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#main_sj}.
	 * @param ctx the parse tree
	 */
	void exitMain_sj(sjParser.Main_sjContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(sjParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(sjParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#bibname}.
	 * @param ctx the parse tree
	 */
	void enterBibname(sjParser.BibnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#bibname}.
	 * @param ctx the parse tree
	 */
	void exitBibname(sjParser.BibnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#klass}.
	 * @param ctx the parse tree
	 */
	void enterKlass(sjParser.KlassContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#klass}.
	 * @param ctx the parse tree
	 */
	void exitKlass(sjParser.KlassContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(sjParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(sjParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(sjParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(sjParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(sjParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(sjParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(sjParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(sjParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(sjParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(sjParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(sjParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(sjParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(sjParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(sjParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(sjParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(sjParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(sjParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(sjParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(sjParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(sjParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(sjParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(sjParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(sjParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(sjParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#varText}.
	 * @param ctx the parse tree
	 */
	void enterVarText(sjParser.VarTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#varText}.
	 * @param ctx the parse tree
	 */
	void exitVarText(sjParser.VarTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(sjParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(sjParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(sjParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(sjParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sjParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sjParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(sjParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(sjParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(sjParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(sjParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(sjParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(sjParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#endEx}.
	 * @param ctx the parse tree
	 */
	void enterEndEx(sjParser.EndExContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#endEx}.
	 * @param ctx the parse tree
	 */
	void exitEndEx(sjParser.EndExContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(sjParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(sjParser.TerminalContext ctx);
}