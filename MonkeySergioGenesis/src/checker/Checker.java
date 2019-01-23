package checker;

import generated.MyParser;
import generated.MyParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;


public class Checker extends MyParserBaseVisitor {
    private SymTable tablaIDs = null;
    DefaultListModel defaultListModel;
    public Checker(JList list){
        defaultListModel=(DefaultListModel) list.getModel();
        this.tablaIDs=new SymTable();
    }




    @Override
    public Object visitPrograma(MyParser.ProgramaContext ctx) {
        //return super.visitPrograma(ctx);
        for( MyParser.StatementContext ele : ctx.statement()) {
            visit(ele);
        }

        /*
        ingresamos las funciones del lenguaje (len,last,first...)
        */
       // this.tablaIDs.insertar("len",0,ctx);
        //this.tablaIDs.insertar("first",6,ctx);
        //this.tablaIDs.insertar("last",6,ctx);
        //this.tablaIDs.insertar("rest",6,ctx);
        //this.tablaIDs.insertar("push",6,ctx);
        return null;
    }

    @Override
    public Object visitStatLet(MyParser.StatLetContext ctx) {
        visit(ctx.letStatement());
        return null;
    }

    @Override
    public Object visitStaReturn(MyParser.StaReturnContext ctx) {
        if(tablaIDs.dentrodeFuncion==false){
            String Mymsg="Error semantico linea : " + ctx.RETURN().getSymbol().getLine() + ", Solo se puede retornar dentro de una funcion";
            defaultListModel.addElement(Mymsg);
        }
        visit(ctx.returnStatement());
        return null;
    }

    @Override
    public Object visitStaExpresion(MyParser.StaExpresionContext ctx) {

        visit(ctx.expressionStatement());
        return null;
    }

    @Override
    public Object visitLetStatNodo(MyParser.LetStatNodoContext ctx) {
       // visit(ctx.expression());
        // tiene un id= expresion
        //int tipo=(Integer) visit(ctx.expression());
        if((Integer)visit(ctx.expression())==6){ //si es una funcion
            SymTable.Function fun=tablaIDs.buscarF(ctx.ID().getText());
            if(fun != null){
                //System.out.println("La funcion: "+ctx.ID().getText()+ " ya existe" );
                String Mymsg="Error semantico linea : " + ctx.ID().getSymbol().getLine() + ", La funcion "+ ctx.ID().getText() + " ya existe";
                defaultListModel.addElement(Mymsg);
            }else{
                tablaIDs.insertarF(ctx.ID().getSymbol(),6,tablaIDs.cantidadParametros,ctx);
                //se guarda tipo 6 como func, pero si tuviera un return deberia ser tipo 5 (neutral)
            }
        }
        else{
            SymTable.Ident res = tablaIDs.buscar(ctx.ID().getText());
            if(res != null && res.nivel==tablaIDs.tempNivelActual){ //permite repetir declaraciones en diferentes niveles
                System.out.println(" <<<<<<<-----nivel actual es: "+tablaIDs.tempNivelActual+ "res.nivel= "+res.nivel );
                String Mymsg="Error semantico linea : " + ctx.ID().getSymbol().getLine() + " , la variable "+ ctx.ID().getText() + " ya existe";
                defaultListModel.addElement(Mymsg);
            }else{
                tablaIDs.insertar(ctx.ID().getSymbol(),5,ctx);
                if(tablaIDs.variableRepetida){
                    String Mymsg="Error semantico linea : " + ctx.ID().getSymbol().getLine() + " , la variable "+ ctx.ID().getText() + " ya existe";
                    defaultListModel.addElement(Mymsg);
                }
            }

        }

        tablaIDs.imprimir();
        tablaIDs.imprimirF();
        return null;
    }

    @Override
    public Object visitReturnStatNodo(MyParser.ReturnStatNodoContext ctx) {

        visit(ctx.expression());
        //return super.visitReturnStatNodo(ctx);
        return null;
    }

    @Override
    public Object visitEspressionStatNodo(MyParser.EspressionStatNodoContext ctx) {
        visit(ctx.expression());
        return null;
        //return super.visitEspressionStatNodo(ctx);
    }

    @Override
    public Object visitExpressionNodo(MyParser.ExpressionNodoContext ctx) {
        int t=(Integer)visit(ctx.additionExpression());
        //visit(ctx.additionExpression());
        visit(ctx.comparison());
        return t;
        //return super.visitExpressionNodo(ctx);
    }

    @Override
    public Object visitComparisionNodo(MyParser.ComparisionNodoContext ctx) {
        int tipE=5;
        for(MyParser.AdditionExpressionContext ele : ctx.additionExpression()){
            tipE=(Integer) visit(ele);
        }
        return tipE;
    }

    @Override
    public Object visitAddExprNodo(MyParser.AddExprNodoContext ctx) {
        //hay que preguntar si son del mismo tipo(int,int   str, str   etc) tipos validos para operar
        int tipo1=-1;
        int tipo2=-1;

        tipo1=(Integer)visit(ctx.multiplicationExpression());
        tipo2=(Integer)visit(ctx.additionFactor());

        if((tipo1!=2 && tipo2!=2) || (tipo1==2 && tipo2!=2)){
            if(tipo1==tipo2){
                return tipo1;
            }

            else if(tipo1==-1 || tipo2==-1){
                if(tipo1==-1) return tipo2;
                else return tipo1;
            }
            else if(tipo1==5 || tipo2==5){
                return 5;
            }
            //System.out.println("###### tipos invalidos: " + tipo1 + " no opera con "+ tipo2);
            String Mymsg="Error semantico : tipos invalidos: " +  tablaIDs.tipos[tipo1] + " no opera con "+  tablaIDs.tipos[tipo2];
            defaultListModel.addElement(Mymsg);
            return -1;
        }
        String Mymsg="Error semantico : tipos invalidos: No se opera con booleanos" ;
        defaultListModel.addElement(Mymsg);

        //visit(ctx.multiplicationExpression());
        //visit(ctx.additionFactor());
        return tipo1;
        //return null;
    }

    @Override
    public Object visitAddFactNodo(MyParser.AddFactNodoContext ctx) {

        int t=-1;
        for(MyParser.MultiplicationExpressionContext ele: ctx.multiplicationExpression()){
            t=(Integer)visit(ele);
            visit(ele);
        }
        return t;

    }

    @Override
    public Object visitMultExprNodo(MyParser.MultExprNodoContext ctx) {
        int tipo1=-1;
        int tipo2=-1;

        tipo1=(Integer)visit(ctx.elementExpression());
        tipo2=(Integer)visit(ctx.multiplicationFactor());

        if(tipo1==tipo2){
            return tipo1;
        }
        else if(tipo1==-1 || tipo2==-1){
            if(tipo1==-1) return tipo2;
            else return tipo1;
        }
        else if(tipo1==5 || tipo2==5){
            return 5;
        }
        //System.out.println("###### tipos invalidos: " + tipo1 + " no opera con "+ tipo2);
        String Mymsg="Error semantico : tipos invalidos: " + tablaIDs.tipos[tipo1] + " no opera con "+ tablaIDs.tipos[tipo2];
        defaultListModel.addElement(Mymsg);


        //visit(ctx.elementExpression());
        //visit(ctx.multiplicationFactor());
        return tipo1;

        //return null;
    }

    @Override
    public Object visitMultFactNodo(MyParser.MultFactNodoContext ctx) {

        int t=-1;

        for(MyParser.ElementExpressionContext ele: ctx.elementExpression()){
            t=(Integer)visit(ele);
            visit(ele);
        }
        return t;

    }

    @Override
    public Object visitElemtExprNodo(MyParser.ElemtExprNodoContext ctx) {
        int t=-1;

        t=(Integer)visit(ctx.primitiveExpression());

        //visit(ctx.primitiveExpression());
        if(ctx.elementAccess()!=null){
            visit(ctx.elementAccess());
        }
        else if(ctx.callExpression()!=null){
            SymTable.Function res = tablaIDs.buscarF(ctx.primitiveExpression().getText());
            if(res == null){
                //visit(ctx.callExpression());
                //System.out.println("la funcion  "+ ctx.primitiveExpression().getText()+ " no existe");
                String Mymsg="Error semantico: la funcion"  + ctx.primitiveExpression().getText()+ " no existe";
                defaultListModel.addElement(Mymsg);
            }else{
                int cant=(Integer)visit(ctx.callExpression());
                if(res.args!=cant)
                {
                    //System.out.println("->cantidad de argumentos erronea !");
                    String Mymsg="Error semantico: Cantidad de argumentos erronea en funcion: "+ ctx.primitiveExpression().getText();
                    defaultListModel.addElement(Mymsg);
                }
            }
        }
        return t;

    }

    @Override
    public Object visitEletAccNodo(MyParser.EletAccNodoContext ctx) {
        int t=(Integer)visit(ctx.expression());
        System.out.println("es un textote"+ t);
        if(t!=0 && t!=5 ){// si no es ni entero ni una variable
            //System.out.println("-> Error: El indice debe ser una valor entero. Linea: " + ctx.PCI().getSymbol().getLine());
            String Mymsg="Error semantico linea: "+ ctx.PCI().getSymbol().getLine()+ ", Indice debe ser valor entero";
            defaultListModel.addElement(Mymsg);

        }
        return t;
        //return super.visitEletAccNodo(ctx);
    }

    @Override
    public Object visitCallExpNodo(MyParser.CallExpNodoContext ctx) {
        int cant=(Integer) visit(ctx.expressionList());
        return cant;
    }

    @Override
    public Object visitPeInt(MyParser.PeIntContext ctx) {
        //entero retorna 0
        return 0;
        //return super.visitPeInt(ctx);
    }

    @Override
    public Object visitPeStr(MyParser.PeStrContext ctx) {

        // string retorna 1
        return 1;
    }

    @Override
    public Object visitPeID(MyParser.PeIDContext ctx) {
        /*
        en esta funcion solo se usa el id, entonces es necesario que exista.
        la funcion let es la unica que permite crear una variable.
        */
        SymTable.Function res2=tablaIDs.buscarF(ctx.ID().getText());
        SymTable.Ident res = tablaIDs.buscar(ctx.ID().getText());
        if(res == null && res2==null){
            //System.out.println("--->> la variable "+ ctx.ID().getText() + " no existe");
            String Mymsg="Error semantico linea: "+ ctx.ID().getSymbol().getLine()+ ", la variable "+ ctx.ID().getText() + " no existe";
            defaultListModel.addElement(Mymsg);
        }
        return 5;
    }

    @Override
    public Object visitPeTrue(MyParser.PeTrueContext ctx) {
        //boleanos retorna 2
        return 2;
        //return super.visitPeTrue(ctx);
    }

    @Override
    public Object visitPrFalse(MyParser.PrFalseContext ctx) {
        //boleanos retorna 2
        return 2;
        //return super.visitPrFalse(ctx);
    }

    @Override
    public Object visitPeParExpre(MyParser.PeParExpreContext ctx) {
        int t=(Integer) visit(ctx.expression());
        return t;
        //return super.visitPeParExpre(ctx);
    }

    @Override
    public Object visitPeArrLit(MyParser.PeArrLitContext ctx) {
        visit(ctx.arrayLiteral());
        //retorna un valor para identificarla como list
        return 3;
        //return super.visitPeArrLit(ctx);
    }

    @Override
    public Object visitPeArrFuntExpL(MyParser.PeArrFuntExpLContext ctx) {
        int t=(Integer)visit(ctx.arrayFunctions());
        visit(ctx.expressionList());
        return t;
        //return super.visitPeArrFuntExpL(ctx);
    }

    @Override
    public Object visitPeFuntLit(MyParser.PeFuntLitContext ctx) {
        visit(ctx.functionLiteral());
        return 6;
        //suponiendo que el tipo func es 6
    }

    @Override
    public Object visitPeHashLit(MyParser.PeHashLitContext ctx) {
        visit(ctx.hashLiteral());
        return 5;
        //return super.visitPeHashLit(ctx);
    }

    @Override
    public Object visitPePrintExp(MyParser.PePrintExpContext ctx) {
        visit(ctx.printExpression());
        return 5;
        //return super.visitPePrintExp(ctx);
    }

    @Override
    public Object visitPeIfExp(MyParser.PeIfExpContext ctx) {
        int t=(Integer) visit(ctx.ifExpression());
        return t;
        //return super.visitPeIfExp(ctx);
    }

    @Override
    public Object visitArrLen(MyParser.ArrLenContext ctx) {
        //siempre va a retornar un numero
        return 0;
        //return super.visitArrLen(ctx);
    }

    @Override
    public Object visitArrFirst(MyParser.ArrFirstContext ctx) {
        //puede retornar cualquier tipo que pueda contener una lista, lo tomaremos como neutral por ahora
        return 5;
        //return super.visitArrFirst(ctx);
    }

    @Override
    public Object visitArrLast(MyParser.ArrLastContext ctx) {
        //puede retornar cualquier tipo que pueda contener una lista, lo tomaremos como neutral por ahora
        return 5;
    }

    @Override
    public Object visitArrRest(MyParser.ArrRestContext ctx) {
        return 5;
        //return super.visitArrRest(ctx);
    }

    @Override
    public Object visitArrPush(MyParser.ArrPushContext ctx) {
        return 5;
        //return super.visitArrPush(ctx);
    }

    @Override
    public Object visitArrLit(MyParser.ArrLitContext ctx) {
        visit(ctx.expressionList());
        return null;
        //return super.visitArrLit(ctx);
    }

    @Override
    public Object visitFuntLitNodo(MyParser.FuntLitNodoContext ctx) {
        //se meten dentro de un bloque que incluye ambos. Debe validarse que los parametros sean como variables del blockS

        tablaIDs.openScope();
        tablaIDs.bloqueMetodoAbierto=true;
        tablaIDs.dentrodeFuncion=true;
        //visit(ctx.functionParameters());
        int parametros=(Integer)visit(ctx.functionParameters());
        tablaIDs.cantidadParametros=parametros;

        visit(ctx.blockStatement());
        tablaIDs.dentrodeFuncion=false;
        tablaIDs.closeScope();
        //la funcion se puede operar, pero no se sabe de que tipo es
        return 6; //tipo funcion
        //no puedo retornar la cantidad de parametros porque requiero saber que sea funcion
    }

    @Override
    public Object visitFuntParaNodo(MyParser.FuntParaNodoContext ctx) {
        tablaIDs.insertar(ctx.ID().getSymbol(),5,ctx);
        int cant=(Integer)visit(ctx.moreIdentifiers()); // la cantidad de parametros de la funcion
        //visit(ctx.moreIdentifiers());
        return cant;

    }

    @Override
    public Object visitMoreIdNodo(MyParser.MoreIdNodoContext ctx) {

        int cant=1;
        for(TerminalNode ele: ctx.ID()){
            //t=(Integer)visit(ele);
            cant++;
            tablaIDs.insertar(ele.getSymbol(),5,ctx);// tipo neutral
            visit(ele);
        }
        //son ids para parametros de una funcion
        return cant;
    }

    @Override
    public Object visitHashLitNodo(MyParser.HashLitNodoContext ctx) {
        visit(ctx.hashContent());
        visit(ctx.moreHashContent());
        return null;
        //return super.visitHashLitNodo(ctx);
    }

    @Override
    public Object visitHashContNodo(MyParser.HashContNodoContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        // se hace asi porque son unicamente 2 expresiones separadas por :
        return null;
        //return super.visitHashContNodo(ctx);
    }

    @Override
    public Object visitMoreHCNodo(MyParser.MoreHCNodoContext ctx) {
        for(MyParser.HashContentContext ele: ctx.hashContent()){
            visit(ele);
        }
        return null;
        //return super.visitMoreHCNodo(ctx);
    }

    @Override
    public Object visitExpListllena(MyParser.ExpListllenaContext ctx) {
        int cont=0;
        visit(ctx.expression());
        cont=(Integer) visit(ctx.moreExpressions());
        return cont;
        //return super.visitExpListllena(ctx);
    }

    @Override
    public Object visitExpListVacia(MyParser.ExpListVaciaContext ctx) {
        return 0; // con 0 elementos
        //return super.visitExpListVacia(ctx);
    }

    @Override
    public Object visitMorExpNodo(MyParser.MorExpNodoContext ctx) {
        int cont=1;
        for(MyParser.ExpressionContext ele: ctx.expression()){
            cont++;
            visit(ele);
        }
        return cont;
    }

    @Override
    public Object visitPrintExpNodo(MyParser.PrintExpNodoContext ctx) {
        visit(ctx.expression());
        return 5;
        //return super.visitPrintExpNodo(ctx);
    }

    @Override
    public Object visitIfExpNodo(MyParser.IfExpNodoContext ctx) {
        int tipo=(Integer) visit(ctx.expression());
        /*if(tipo!=2 && tipo!=5){
            //System.out.println("Tipo "+ tipo+ " en la condicion del if");
            String Mymsg="Error semantico: La condicion del 'if' debe representar un valor booleano";
            defaultListModel.addElement(Mymsg);
        }*/
        visit(ctx.blockStatement(0));
        if(ctx.blockStatement(1)!=null){
            visit(ctx.blockStatement(1));
        }
        return 5;
        //return super.visitIfExpNodo(ctx);
    }

    @Override
    public Object visitBlkStatNodo(MyParser.BlkStatNodoContext ctx) {
        // lleva un { bloque de codigo}
        //si viene de una funcion, ya el bloque se abrio con los parametros dentro, no será necesario abrir uno nuevo.
        if(this.tablaIDs.bloqueMetodoAbierto){
            this.tablaIDs.bloqueMetodoAbierto=false;
            for(MyParser.StatementContext ele: ctx.statement()){
                visit(ele);
            }
            return null;
        }
        this.tablaIDs.openScope();
        for(MyParser.StatementContext ele: ctx.statement()){
            visit(ele);
        }
        this.tablaIDs.closeScope();
        return null;
        //return super.visitBlkStatNodo(ctx);
    }

    @Override
    public Object visitOpSum(MyParser.OpSumContext ctx) {
        //System.out.println("sumando");
        return null;
        //return super.visitOpSum(ctx);
    }

    @Override
    public Object visitOpSub(MyParser.OpSubContext ctx) {
        //System.out.println("restando");
        return null;
        //return super.visitOpSub(ctx);
    }

    @Override
    public Object visitOpMul(MyParser.OpMulContext ctx) {
        //System.out.println("multiplicando");
        return null;
        //return super.visitOpMul(ctx);
    }

    @Override
    public Object visitOpDiv(MyParser.OpDivContext ctx) {
        //System.out.println("dividiendo");
        return null;
        //return super.visitOpDiv(ctx);
    }
}
