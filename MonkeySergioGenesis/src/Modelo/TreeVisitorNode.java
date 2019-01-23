package Modelo;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import Modelo.MyTreeCellRenderer;
import generated.MyParser;
import generated.MyParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;


public class TreeVisitorNode extends MyParserBaseVisitor<Object> {

    private int cont = 0;

    private void tabular(int n) {
        for (int num = n; num != 0; num--)
            System.out.print("+++");
        System.out.print(">");
    }

    @Override
    public Object visitPrograma(MyParser.ProgramaContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.statement(0));
        cont--;

        return null;
        //return super.visitPrograma(ctx);
    }

    @Override
    public Object visitStatLet(MyParser.StatLetContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.letStatement());
        cont--;
        return null;
        //return super.visitStatLet(ctx);
    }

    @Override
    public Object visitStaReturn(MyParser.StaReturnContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.returnStatement());
        cont--;
        return null;
        //return super.visitStaReturn(ctx);
    }

    @Override
    public Object visitStaExpresion(MyParser.StaExpresionContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expressionStatement());
        cont--;
        return null;
        //return super.visitStaExpresion(ctx);
    }

    @Override
    public Object visitLetStatNodo(MyParser.LetStatNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.ID());
        visit(ctx.IG());
        visit(ctx.expression());
        visit(ctx.PyCOMA());
        cont--;
        return null;
        //return super.visitLetStatNodo(ctx);
    }

    @Override
    public Object visitReturnStatNodo(MyParser.ReturnStatNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expression());
        visit(ctx.PyCOMA());
        cont--;
        return null;
        //return super.visitReturnStatNodo(ctx);
    }

    @Override
    public Object visitEspressionStatNodo(MyParser.EspressionStatNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expression());
        visit(ctx.PyCOMA());
        cont--;
        return null;
        //return super.visitEspressionStatNodo(ctx);
    }

    @Override
    public Object visitExpressionNodo(MyParser.ExpressionNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.additionExpression());
        visit(ctx.comparison());
        cont--;
        return null;
        //return super.visitExpressionNodo(ctx);
    }

    @Override
    public Object visitComparisionNodo(MyParser.ComparisionNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int i = 0; i < ctx.additionExpression().size(); i++){
            if(!ctx.IGIG().isEmpty()){
                tabular(cont);
                System.out.println(ctx.IGIG().getClass().getSimpleName());
            }
            else if(!ctx.MAYI().isEmpty()){
                tabular(cont);
                System.out.println(ctx.MAYI().getClass().getSimpleName());
            }
            else if(!ctx.MENI().isEmpty()){
                tabular(cont);
                System.out.println(ctx.MENI().getClass().getSimpleName());
            }
            else if(!ctx.MAY().isEmpty()){
                tabular(cont);
                System.out.println(ctx.MAY().getClass().getSimpleName());
            }
            else if(!ctx.MEN().isEmpty()){
                tabular(cont);
                System.out.println(ctx.MEN().getClass().getSimpleName());
            }

            visit(ctx.additionExpression(i));
        }
        cont--;
        return null;
        //return super.visitComparisionNodo(ctx);
    }

    @Override
    public Object visitAddExprNodo(MyParser.AddExprNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.multiplicationExpression());
        visit(ctx.additionFactor());
        cont--;
        return null;
        //return super.visitAddExprNodo(ctx);
    }

    @Override
    public Object visitAddFactNodo(MyParser.AddFactNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int i = 0; i < ctx.multiplicationExpression().size(); i++){
            if(!ctx.SUB().isEmpty()){
                tabular(cont);
                System.out.println(ctx.SUB().getClass().getSimpleName());
            }
            else if(!ctx.SUM().isEmpty()){
                tabular(cont);
                System.out.println(ctx.SUM().getClass().getSimpleName());
            }

            visit(ctx.multiplicationExpression(i));
        }
        cont--;
        return null;
        //return super.visitAddFactNodo(ctx);
    }

    @Override
    public Object visitMultExprNodo(MyParser.MultExprNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.elementExpression());
        visit(ctx.multiplicationFactor());
        cont--;
        return null;
        //return super.visitMultExprNodo(ctx);
    }

    @Override
    public Object visitMultFactNodo(MyParser.MultFactNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int i = 0; i < ctx.elementExpression().size(); i++){
            if(!ctx.DIV().isEmpty()){
                tabular(cont);
                System.out.println(ctx.DIV().getClass().getSimpleName());
            }
            else if(!ctx.MUL().isEmpty()){
                tabular(cont);
                System.out.println(ctx.MUL().getClass().getSimpleName());
            }

            visit(ctx.elementExpression(i));
        }
        cont--;

        return null;
        //return super.visitMultFactNodo(ctx);
    }

    @Override
    public Object visitElemtExprNodo(MyParser.ElemtExprNodoContext ctx) {

        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.primitiveExpression());
        if(ctx.elementAccess()!=null){
            if(!ctx.elementAccess().isEmpty()){
                 visit(ctx.elementAccess());
                //System.out.print("se esta cayendo aqui");
            }
        }
        else if(ctx.callExpression()!=null){
            if(!ctx.callExpression().isEmpty()) {
                visit(ctx.callExpression());
            }
        }
        cont--;

        return null;
        //return super.visitElemtExprNodo(ctx);
    }

    @Override
    public Object visitEletAccNodo(MyParser.EletAccNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.PCI().getClass().getSimpleName());
        visit(ctx.expression());
        tabular(cont);
        System.out.println(ctx.PCD().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitEletAccNodo(ctx);
    }

    @Override
    public Object visitCallExpNodo(MyParser.CallExpNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.PIZQ().getClass().getSimpleName());
        visit(ctx.expressionList());
        tabular(cont);
        System.out.println(ctx.PDER().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitCallExpNodo(ctx);
    }

    @Override
    public Object visitPeInt(MyParser.PeIntContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.INTEGER().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitPeInt(ctx);
    }

    @Override
    public Object visitPeStr(MyParser.PeStrContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.STRING().getClass().getSimpleName());
        cont--;
        return null;

        //return super.visitPeStr(ctx);
    }

    @Override
    public Object visitPeID(MyParser.PeIDContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.ID().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitPeID(ctx);
    }

    @Override
    public Object visitPeTrue(MyParser.PeTrueContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.TRUE().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitPeTrue(ctx);
    }

    @Override
    public Object visitPrFalse(MyParser.PrFalseContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.FALSE().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitPrFalse(ctx);
    }

    @Override
    public Object visitPeParExpre(MyParser.PeParExpreContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.PIZQ().getClass().getSimpleName());
        visit(ctx.expression());
        tabular(cont);
        System.out.println(ctx.PDER().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitPeParExpre(ctx);
    }

    @Override
    public Object visitPeArrLit(MyParser.PeArrLitContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.arrayLiteral());
        cont--;

        return null;
        //return super.visitPeArrLit(ctx);
    }

    @Override
    public Object visitPeArrFuntExpL(MyParser.PeArrFuntExpLContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.arrayFunctions());
        tabular(cont);
        System.out.println(ctx.PIZQ().getClass().getSimpleName());
        visit(ctx.expressionList());
        tabular(cont);
        System.out.println(ctx.PDER().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitPeArrFuntExpL(ctx);
    }

    @Override
    public Object visitPeFuntLit(MyParser.PeFuntLitContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.functionLiteral());
        cont--;

        return null;
        //return super.visitPeFuntLit(ctx);
    }

    @Override
    public Object visitPeHashLit(MyParser.PeHashLitContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.hashLiteral());
        cont--;

        return null;
        //return super.visitPeHashLit(ctx);
    }

    @Override
    public Object visitPePrintExp(MyParser.PePrintExpContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.printExpression());
        cont--;

        return null;
        //return super.visitPePrintExp(ctx);
    }

    @Override
    public Object visitPeIfExp(MyParser.PeIfExpContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.ifExpression());
        cont--;

        return null;
        //return super.visitPeIfExp(ctx);
    }

    @Override
    public Object visitArrLen(MyParser.ArrLenContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.LEN().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitArrLen(ctx);
    }

    @Override
    public Object visitArrFirst(MyParser.ArrFirstContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.FIRST().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitArrFirst(ctx);
    }

    @Override
    public Object visitArrLast(MyParser.ArrLastContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.LAST().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitArrLast(ctx);
    }

    @Override
    public Object visitArrRest(MyParser.ArrRestContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.REST().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitArrRest(ctx);
    }

    @Override
    public Object visitArrPush(MyParser.ArrPushContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.PUSH().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitArrPush(ctx);
    }

    @Override
    public Object visitArrLit(MyParser.ArrLitContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.PCI().getClass().getSimpleName());
        visit(ctx.expressionList());
        tabular(cont);
        System.out.println(ctx.PCD().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitArrLit(ctx);
    }

    @Override
    public Object visitFuntLitNodo(MyParser.FuntLitNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.FN().getClass().getSimpleName());
        tabular(cont);
        System.out.println(ctx.PIZQ().getClass().getSimpleName());
        visit(ctx.functionParameters());
        tabular(cont);
        System.out.println(ctx.PDER().getClass().getSimpleName());
        visit(ctx.blockStatement());
        cont--;

        return null;
        //return super.visitFuntLitNodo(ctx);
    }

    @Override
    public Object visitFuntParaNodo(MyParser.FuntParaNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.ID().getClass().getSimpleName());
        visit(ctx.moreIdentifiers());
        cont--;
        return null;
        //return super.visitFuntParaNodo(ctx);
    }

    @Override
    public Object visitMoreIdNodo(MyParser.MoreIdNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int i = 0; i < ctx.COMA().size(); i++){

            tabular(cont);
            System.out.println(ctx.COMA().getClass().getSimpleName());
            tabular(cont);
            System.out.println(ctx.ID().getClass().getSimpleName());

        }
        cont--;

        return null;
        //return super.visitMoreIdNodo(ctx);
    }

    @Override
    public Object visitHashLitNodo(MyParser.HashLitNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.LLI().getClass().getSimpleName());
        visit(ctx.hashContent());
        visit(ctx.moreHashContent());
        tabular(cont);
        System.out.println(ctx.LLD().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitHashLitNodo(ctx);
    }

    @Override
    public Object visitHashContNodo(MyParser.HashContNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit((ParseTree) ctx.expression());
        tabular(cont);
        System.out.println(ctx.DOSPUN().getClass().getSimpleName());
        visit((ParseTree) ctx.expression());
        cont--;
        return null;
        //return super.visitHashContNodo(ctx);
    }

    @Override
    public Object visitMoreHCNodo(MyParser.MoreHCNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int i = 0; i < ctx.COMA().size(); i++){

            tabular(cont);
            System.out.println(ctx.COMA().getClass().getSimpleName());
            visit(ctx.hashContent(i));

        }
        cont--;

        return null;
        //return super.visitMoreHCNodo(ctx);
    }

    @Override
    public Object visitExpListllena(MyParser.ExpListllenaContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expression());
        visit(ctx.moreExpressions());
        cont--;
        return null;
        //return super.visitExpListllena(ctx);
    }

    @Override
    public Object visitExpListVacia(MyParser.ExpListVaciaContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        tabular(cont);
        System.out.println("lista vacia[ ]");
        cont--;
        return null;
        //return super.visitExpListVacia(ctx);
    }

    @Override
    public Object visitMorExpNodo(MyParser.MorExpNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int i = 0; i < ctx.COMA().size(); i++){

            tabular(cont);
            System.out.println(ctx.COMA().getClass().getSimpleName());
            visit(ctx.expression(i));

        }
        cont--;

        return null;
        //return super.visitMorExpNodo(ctx);
    }

    @Override
    public Object visitPrintExpNodo(MyParser.PrintExpNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        tabular(cont);
        System.out.println(ctx.PUTS().getClass().getSimpleName());
        tabular(cont);
        System.out.println(ctx.PIZQ().getClass().getSimpleName());
        visit(ctx.expression());
        tabular(cont);
        System.out.println(ctx.PDER().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitPrintExpNodo(ctx);
    }

    @Override
    public Object visitIfExpNodo(MyParser.IfExpNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        tabular(cont);
        System.out.println(ctx.IF().getClass().getSimpleName());
        visit(ctx.expression());
        visit((ParseTree) ctx.blockStatement());

        //System.out.println(ctx.PDER().getClass().getSimpleName());
        cont--;
        return null;
        //return super.visitIfExpNodo(ctx);
    }

    @Override
    public Object visitBlkStatNodo(MyParser.BlkStatNodoContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        tabular(cont);
        System.out.println(ctx.LLI().getClass().getSimpleName());
        for(int i = 0; i < ctx.statement().size(); i++){
            visit(ctx.statement(i));
        }
        tabular(cont);
        System.out.println(ctx.LLD().getClass().getSimpleName());
        cont--;

        return null;
        //return super.visitBlkStatNodo(ctx);
    }

    @Override
    public Object visitOpSum(MyParser.OpSumContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        System.out.println(ctx.SUM().getClass().getSimpleName());
        cont--;
        return  null;
        //return super.visitOpSum(ctx);
    }

    @Override
    public Object visitOpSub(MyParser.OpSubContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        System.out.println(ctx.SUB().getClass().getSimpleName());
        cont--;
        return  null;
        //return super.visitOpSub(ctx);
    }

    @Override
    public Object visitOpMul(MyParser.OpMulContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        System.out.println(ctx.MUL().getClass().getSimpleName());
        cont--;
        return  null;
        //return super.visitOpMul(ctx);
    }

    @Override
    public Object visitOpDiv(MyParser.OpDivContext ctx) {
        tabular(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        System.out.println(ctx.DIV().getClass().getSimpleName());
        cont--;
        return  null;
        //return super.visitOpDiv(ctx);
    }
}


