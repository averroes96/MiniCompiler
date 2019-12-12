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
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(sjParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(sjParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(sjParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(sjParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(sjParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(sjParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(sjParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(sjParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(sjParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(sjParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(sjParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(sjParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(sjParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(sjParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(sjParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(sjParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(sjParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(sjParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(sjParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(sjParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(sjParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(sjParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(sjParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(sjParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(sjParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(sjParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(sjParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(sjParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(sjParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(sjParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(sjParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link sjParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(sjParser.NilAtomContext ctx);
}