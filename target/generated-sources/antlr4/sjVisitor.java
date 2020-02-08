// Generated from sj.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sjParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sjVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sjParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(@NotNull sjParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull sjParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull sjParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull sjParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull sjParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull sjParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(@NotNull sjParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(@NotNull sjParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#main_sj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_sj(@NotNull sjParser.Main_sjContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#klass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKlass(@NotNull sjParser.KlassContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#comparaison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparaison(@NotNull sjParser.ComparaisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull sjParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull sjParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull sjParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#endExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndExpr(@NotNull sjParser.EndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(@NotNull sjParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull sjParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#varText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarText(@NotNull sjParser.VarTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#libraries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraries(@NotNull sjParser.LibrariesContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(@NotNull sjParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(@NotNull sjParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEls(@NotNull sjParser.ElsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#bibname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBibname(@NotNull sjParser.BibnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(@NotNull sjParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull sjParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(@NotNull sjParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(@NotNull sjParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull sjParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(@NotNull sjParser.VarDecContext ctx);
}