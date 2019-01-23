// Generated from C:/Users/sergioaleman/Desktop/2018/compi/MonkeyGS/src/Antlr\MyParser.g4 by ANTLR 4.7
package generated;
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
	 * Visit a parse tree produced by the {@code statLet}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLet(MyParser.StatLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staReturn}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaReturn(MyParser.StaReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staExpresion}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaExpresion(MyParser.StaExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letStatNodo}
	 * labeled alternative in {@link MyParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatNodo(MyParser.LetStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatNodo}
	 * labeled alternative in {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatNodo(MyParser.ReturnStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espressionStatNodo}
	 * labeled alternative in {@link MyParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspressionStatNodo(MyParser.EspressionStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNodo}
	 * labeled alternative in {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNodo(MyParser.ExpressionNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisionNodo}
	 * labeled alternative in {@link MyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisionNodo(MyParser.ComparisionNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprNodo}
	 * labeled alternative in {@link MyParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprNodo(MyParser.AddExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addFactNodo}
	 * labeled alternative in {@link MyParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFactNodo(MyParser.AddFactNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExprNodo}
	 * labeled alternative in {@link MyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprNodo(MyParser.MultExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multFactNodo}
	 * labeled alternative in {@link MyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultFactNodo(MyParser.MultFactNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elemtExprNodo}
	 * labeled alternative in {@link MyParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemtExprNodo(MyParser.ElemtExprNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eletAccNodo}
	 * labeled alternative in {@link MyParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEletAccNodo(MyParser.EletAccNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpNodo}
	 * labeled alternative in {@link MyParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpNodo(MyParser.CallExpNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peInt}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeInt(MyParser.PeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peStr}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeStr(MyParser.PeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peID}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeID(MyParser.PeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peTrue}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeTrue(MyParser.PeTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prFalse}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrFalse(MyParser.PrFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peParExpre}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeParExpre(MyParser.PeParExpreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peArrLit}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeArrLit(MyParser.PeArrLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peArrFuntExpL}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeArrFuntExpL(MyParser.PeArrFuntExpLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peFuntLit}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeFuntLit(MyParser.PeFuntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peHashLit}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeHashLit(MyParser.PeHashLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pePrintExp}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPePrintExp(MyParser.PePrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code peIfExp}
	 * labeled alternative in {@link MyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeIfExp(MyParser.PeIfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrLen}
	 * labeled alternative in {@link MyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrLen(MyParser.ArrLenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrFirst}
	 * labeled alternative in {@link MyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrFirst(MyParser.ArrFirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrLast}
	 * labeled alternative in {@link MyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrLast(MyParser.ArrLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrRest}
	 * labeled alternative in {@link MyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrRest(MyParser.ArrRestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrPush}
	 * labeled alternative in {@link MyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrPush(MyParser.ArrPushContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrLit}
	 * labeled alternative in {@link MyParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrLit(MyParser.ArrLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funtLitNodo}
	 * labeled alternative in {@link MyParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntLitNodo(MyParser.FuntLitNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funtParaNodo}
	 * labeled alternative in {@link MyParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntParaNodo(MyParser.FuntParaNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreIdNodo}
	 * labeled alternative in {@link MyParser#moreIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreIdNodo(MyParser.MoreIdNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashLitNodo}
	 * labeled alternative in {@link MyParser#hashLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashLitNodo(MyParser.HashLitNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashContNodo}
	 * labeled alternative in {@link MyParser#hashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashContNodo(MyParser.HashContNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreHCNodo}
	 * labeled alternative in {@link MyParser#moreHashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreHCNodo(MyParser.MoreHCNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expListllena}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpListllena(MyParser.ExpListllenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expListVacia}
	 * labeled alternative in {@link MyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpListVacia(MyParser.ExpListVaciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code morExpNodo}
	 * labeled alternative in {@link MyParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorExpNodo(MyParser.MorExpNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpNodo}
	 * labeled alternative in {@link MyParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpNodo(MyParser.PrintExpNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpNodo}
	 * labeled alternative in {@link MyParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpNodo(MyParser.IfExpNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkStatNodo}
	 * labeled alternative in {@link MyParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkStatNodo(MyParser.BlkStatNodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opSum}
	 * labeled alternative in {@link MyParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSum(MyParser.OpSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opSub}
	 * labeled alternative in {@link MyParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSub(MyParser.OpSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opMul}
	 * labeled alternative in {@link MyParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMul(MyParser.OpMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opDiv}
	 * labeled alternative in {@link MyParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpDiv(MyParser.OpDivContext ctx);
}