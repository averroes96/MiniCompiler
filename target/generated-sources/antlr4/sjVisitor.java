// Generated from sj.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link sjParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(sjParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#libraries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraries(sjParser.LibrariesContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#main_sj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_sj(sjParser.Main_sjContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(sjParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#bibname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBibname(sjParser.BibnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#klass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKlass(sjParser.KlassContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(sjParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(sjParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(sjParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(sjParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(sjParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(sjParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(sjParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEls(sjParser.ElsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(sjParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(sjParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(sjParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(sjParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#varText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarText(sjParser.VarTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(sjParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(sjParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(sjParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(sjParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(sjParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(sjParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#endEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndEx(sjParser.EndExContext ctx);
	/**
	 * Visit a parse tree produced by {@link sjParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(sjParser.TerminalContext ctx);
}