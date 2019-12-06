// Generated from averroes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link averroesParser}.
 */
public interface averroesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link averroesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(averroesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(averroesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(averroesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(averroesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(averroesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(averroesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(averroesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(averroesParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(averroesParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(averroesParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(averroesParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(averroesParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(averroesParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(averroesParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(averroesParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(averroesParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link averroesParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(averroesParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link averroesParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(averroesParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(averroesParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(averroesParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(averroesParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(averroesParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(averroesParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(averroesParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(averroesParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(averroesParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(averroesParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(averroesParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(averroesParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(averroesParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(averroesParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(averroesParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(averroesParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(averroesParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(averroesParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(averroesParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(averroesParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link averroesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(averroesParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(averroesParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(averroesParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(averroesParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(averroesParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(averroesParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(averroesParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(averroesParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(averroesParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(averroesParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(averroesParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(averroesParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link averroesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(averroesParser.NilAtomContext ctx);
}