// Generated from sj.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sjParser}.
 */
public interface sjListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sjParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(@NotNull sjParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(@NotNull sjParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull sjParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull sjParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull sjParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull sjParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull sjParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull sjParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull sjParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull sjParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull sjParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull sjParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(@NotNull sjParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(@NotNull sjParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull sjParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull sjParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#main_sj}.
	 * @param ctx the parse tree
	 */
	void enterMain_sj(@NotNull sjParser.Main_sjContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#main_sj}.
	 * @param ctx the parse tree
	 */
	void exitMain_sj(@NotNull sjParser.Main_sjContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#klass}.
	 * @param ctx the parse tree
	 */
	void enterKlass(@NotNull sjParser.KlassContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#klass}.
	 * @param ctx the parse tree
	 */
	void exitKlass(@NotNull sjParser.KlassContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void enterComparaison(@NotNull sjParser.ComparaisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void exitComparaison(@NotNull sjParser.ComparaisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull sjParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull sjParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull sjParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull sjParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull sjParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull sjParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#endExpr}.
	 * @param ctx the parse tree
	 */
	void enterEndExpr(@NotNull sjParser.EndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#endExpr}.
	 * @param ctx the parse tree
	 */
	void exitEndExpr(@NotNull sjParser.EndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull sjParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull sjParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull sjParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull sjParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#varText}.
	 * @param ctx the parse tree
	 */
	void enterVarText(@NotNull sjParser.VarTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#varText}.
	 * @param ctx the parse tree
	 */
	void exitVarText(@NotNull sjParser.VarTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#libraries}.
	 * @param ctx the parse tree
	 */
	void enterLibraries(@NotNull sjParser.LibrariesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#libraries}.
	 * @param ctx the parse tree
	 */
	void exitLibraries(@NotNull sjParser.LibrariesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(@NotNull sjParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(@NotNull sjParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(@NotNull sjParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(@NotNull sjParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(@NotNull sjParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(@NotNull sjParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#bibname}.
	 * @param ctx the parse tree
	 */
	void enterBibname(@NotNull sjParser.BibnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#bibname}.
	 * @param ctx the parse tree
	 */
	void exitBibname(@NotNull sjParser.BibnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(@NotNull sjParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(@NotNull sjParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull sjParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull sjParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(@NotNull sjParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(@NotNull sjParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(@NotNull sjParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(@NotNull sjParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull sjParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull sjParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sjParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(@NotNull sjParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link sjParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(@NotNull sjParser.VarDecContext ctx);
}