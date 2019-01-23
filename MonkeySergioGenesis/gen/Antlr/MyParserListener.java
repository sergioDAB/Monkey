// Generated from C:/Users/Arrieta/IdeaProjects/MiniPython/src/Antlr\MyParser.g4 by ANTLR 4.6
package Antlr;

  import Exeptions.MyExeption;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programa}
	 * labeled alternative in {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MyParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MyParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statDef}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatDef(MyParser.StatDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statDef}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatDef(MyParser.StatDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(MyParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(MyParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatReturn(MyParser.StatReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatReturn(MyParser.StatReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statPrint}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(MyParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statPrint}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(MyParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatWhile(MyParser.StatWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatWhile(MyParser.StatWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAsign}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatAsign(MyParser.StatAsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAsign}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatAsign(MyParser.StatAsignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFuncCall}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatFuncCall(MyParser.StatFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFuncCall}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatFuncCall(MyParser.StatFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defStatNodo}
	 * labeled alternative in {@link MyParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefStatNodo(MyParser.DefStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defStatNodo}
	 * labeled alternative in {@link MyParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefStatNodo(MyParser.DefStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argListLlena}
	 * labeled alternative in {@link MyParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgListLlena(MyParser.ArgListLlenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argListLlena}
	 * labeled alternative in {@link MyParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgListLlena(MyParser.ArgListLlenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argListVacia}
	 * labeled alternative in {@link MyParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgListVacia(MyParser.ArgListVaciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argListVacia}
	 * labeled alternative in {@link MyParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgListVacia(MyParser.ArgListVaciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreArgsNodo}
	 * labeled alternative in {@link MyParser#moreArgs}.
	 * @param ctx the parse tree
	 */
	void enterMoreArgsNodo(MyParser.MoreArgsNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreArgsNodo}
	 * labeled alternative in {@link MyParser#moreArgs}.
	 * @param ctx the parse tree
	 */
	void exitMoreArgsNodo(MyParser.MoreArgsNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatNodo}
	 * labeled alternative in {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatNodo(MyParser.IfStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatNodo}
	 * labeled alternative in {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatNodo(MyParser.IfStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatNodo}
	 * labeled alternative in {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatNodo(MyParser.WhileStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatNodo}
	 * labeled alternative in {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatNodo(MyParser.WhileStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatNodo}
	 * labeled alternative in {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatNodo(MyParser.ReturnStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatNodo}
	 * labeled alternative in {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatNodo(MyParser.ReturnStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatNodo}
	 * labeled alternative in {@link MyParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatNodo(MyParser.PrintStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatNodo}
	 * labeled alternative in {@link MyParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatNodo(MyParser.PrintStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asignStatNodo}
	 * labeled alternative in {@link MyParser#asignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAsignStatNodo(MyParser.AsignStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asignStatNodo}
	 * labeled alternative in {@link MyParser#asignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAsignStatNodo(MyParser.AsignStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallNodo}
	 * labeled alternative in {@link MyParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallNodo(MyParser.FuncCallNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallNodo}
	 * labeled alternative in {@link MyParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallNodo(MyParser.FuncCallNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequenceNodo}
	 * labeled alternative in {@link MyParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequenceNodo(MyParser.SequenceNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequenceNodo}
	 * labeled alternative in {@link MyParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequenceNodo(MyParser.SequenceNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreStatNodo}
	 * labeled alternative in {@link MyParser#moreStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoreStatNodo(MyParser.MoreStatNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreStatNodo}
	 * labeled alternative in {@link MyParser#moreStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoreStatNodo(MyParser.MoreStatNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprsNodo}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprsNodo(MyParser.ExprsNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprsNodo}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprsNodo(MyParser.ExprsNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compNodo}
	 * labeled alternative in {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterCompNodo(MyParser.CompNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compNodo}
	 * labeled alternative in {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitCompNodo(MyParser.CompNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExprNodo}
	 * labeled alternative in {@link MyParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExprNodo(MyParser.AddExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExprNodo}
	 * labeled alternative in {@link MyParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExprNodo(MyParser.AddExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addFactorNodo}
	 * labeled alternative in {@link MyParser#additionFactor}.
	 * @param ctx the parse tree
	 */
	void enterAddFactorNodo(MyParser.AddFactorNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addFactorNodo}
	 * labeled alternative in {@link MyParser#additionFactor}.
	 * @param ctx the parse tree
	 */
	void exitAddFactorNodo(MyParser.AddFactorNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExprNodo}
	 * labeled alternative in {@link MyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExprNodo(MyParser.MulExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExprNodo}
	 * labeled alternative in {@link MyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExprNodo(MyParser.MulExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulFactorNodo}
	 * labeled alternative in {@link MyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void enterMulFactorNodo(MyParser.MulFactorNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulFactorNodo}
	 * labeled alternative in {@link MyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void exitMulFactorNodo(MyParser.MulFactorNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmtExprNodo}
	 * labeled alternative in {@link MyParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void enterElmtExprNodo(MyParser.ElmtExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmtExprNodo}
	 * labeled alternative in {@link MyParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void exitElmtExprNodo(MyParser.ElmtExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmtAccessNodo}
	 * labeled alternative in {@link MyParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void enterElmtAccessNodo(MyParser.ElmtAccessNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmtAccessNodo}
	 * labeled alternative in {@link MyParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void exitElmtAccessNodo(MyParser.ElmtAccessNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MyParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(MyParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link MyParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(MyParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprListNodo}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExprListNodo(MyParser.ExprListNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListNodo}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExprListNodo(MyParser.ExprListNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprListEpsilon}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExprListEpsilon(MyParser.ExprListEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListEpsilon}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExprListEpsilon(MyParser.ExprListEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreExprNodo}
	 * labeled alternative in {@link MyParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMoreExprNodo(MyParser.MoreExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreExprNodo}
	 * labeled alternative in {@link MyParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMoreExprNodo(MyParser.MoreExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntPriExprNodo(MyParser.IntPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntPriExprNodo(MyParser.IntPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrPriExprNodo(MyParser.StrPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrPriExprNodo(MyParser.StrPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdPriExprNodo(MyParser.IdPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdPriExprNodo(MyParser.IdPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharPriExprNodo(MyParser.CharPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharPriExprNodo(MyParser.CharPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterExprPriExprNodo(MyParser.ExprPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitExprPriExprNodo(MyParser.ExprPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterListPriExprNodo(MyParser.ListPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitListPriExprNodo(MyParser.ListPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lenPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterLenPriExprNodo(MyParser.LenPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lenPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitLenPriExprNodo(MyParser.LenPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallPriExprNodo(MyParser.FuncCallPriExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallPriExprNodo}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallPriExprNodo(MyParser.FuncCallPriExprNodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExprNodo}
	 * labeled alternative in {@link MyParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExprNodo(MyParser.ListExprNodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExprNodo}
	 * labeled alternative in {@link MyParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExprNodo(MyParser.ListExprNodoContext ctx);
}