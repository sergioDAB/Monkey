// Generated from C:/Users/Arrieta/IdeaProjects/MiniPython/src/Antlr\MyParser.g4 by ANTLR 4.6
package Antlr;

  import Exeptions.MyExeption;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link MyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MyParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statDef}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatDef(MyParser.StatDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatIf(MyParser.StatIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatReturn(MyParser.StatReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statPrint}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(MyParser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatWhile(MyParser.StatWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statAsign}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAsign(MyParser.StatAsignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFuncCall}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFuncCall(MyParser.StatFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defStatNodo}
	 * labeled alternative in {@link MyParser#defStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatNodo(MyParser.DefStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListLlena}
	 * labeled alternative in {@link MyParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListLlena(MyParser.ArgListLlenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListVacia}
	 * labeled alternative in {@link MyParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListVacia(MyParser.ArgListVaciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreArgsNodo}
	 * labeled alternative in {@link MyParser#moreArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreArgsNodo(MyParser.MoreArgsNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatNodo}
	 * labeled alternative in {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatNodo(MyParser.IfStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatNodo}
	 * labeled alternative in {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatNodo(MyParser.WhileStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatNodo}
	 * labeled alternative in {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatNodo(MyParser.ReturnStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatNodo}
	 * labeled alternative in {@link MyParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatNodo(MyParser.PrintStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignStatNodo}
	 * labeled alternative in {@link MyParser#asignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignStatNodo(MyParser.AsignStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallNodo}
	 * labeled alternative in {@link MyParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallNodo(MyParser.FuncCallNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceNodo}
	 * labeled alternative in {@link MyParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceNodo(MyParser.SequenceNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreStatNodo}
	 * labeled alternative in {@link MyParser#moreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreStatNodo(MyParser.MoreStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprsNodo}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprsNodo(MyParser.ExprsNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compNodo}
	 * labeled alternative in {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompNodo(MyParser.CompNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprNodo}
	 * labeled alternative in {@link MyParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprNodo(MyParser.AddExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addFactorNodo}
	 * labeled alternative in {@link MyParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFactorNodo(MyParser.AddFactorNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExprNodo}
	 * labeled alternative in {@link MyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExprNodo(MyParser.MulExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulFactorNodo}
	 * labeled alternative in {@link MyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulFactorNodo(MyParser.MulFactorNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elmtExprNodo}
	 * labeled alternative in {@link MyParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElmtExprNodo(MyParser.ElmtExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elmtAccessNodo}
	 * labeled alternative in {@link MyParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElmtAccessNodo(MyParser.ElmtAccessNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MyParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(MyParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprListNodo}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListNodo(MyParser.ExprListNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprListEpsilon}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListEpsilon(MyParser.ExprListEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExprNodo}
	 * labeled alternative in {@link MyParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExprNodo(MyParser.MoreExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPriExprNodo(MyParser.IntPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrPriExprNodo(MyParser.StrPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPriExprNodo(MyParser.IdPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPriExprNodo(MyParser.CharPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPriExprNodo(MyParser.ExprPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPriExprNodo(MyParser.ListPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lenPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenPriExprNodo(MyParser.LenPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallPriExprNodo(MyParser.FuncCallPriExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExprNodo}
	 * labeled alternative in {@link MyParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExprNodo(MyParser.ListExprNodoContext ctx);
}