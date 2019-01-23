package interpreter;

import com.sun.org.apache.xpath.internal.operations.String;
import generated.MyParser;
import generated.MyParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jaxen.saxpath.Operator;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Interpreter extends MyParserBaseVisitor {

    private DataStorage dataS = null;
    private EvaluationStack evalStack=null;
    DefaultListModel defaultListModel;
    public Interpreter(JList list){
        defaultListModel=(DefaultListModel) list.getModel();
        this.dataS=new DataStorage();
        this.evalStack = new EvaluationStack();
    }

    @Override
    public Object visitPrograma(MyParser.ProgramaContext ctx) {
        for( MyParser.StatementContext ele : ctx.statement()) {
            visit(ele);
        }
        return null;
    }

    @Override
    public Object visitStatLet(MyParser.StatLetContext ctx) {

        visit(ctx.letStatement());
        System.out.println(this.dataS.toString());

        return null;
    }

    @Override
    public Object visitStaReturn(MyParser.StaReturnContext ctx) {
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

        visit(ctx.expression());
        Object temp=evalStack.popValue();



        if(temp.getClass()==Integer.class){
            this.dataS.addData(ctx.ID().getText(),new Integer((Integer)temp));
        }
        else if (temp.getClass()== java.lang.String.class){
            this.dataS.addData(ctx.ID().getText(), new java.lang.String(temp.toString()));
        }
        else if (temp.getClass()== Boolean.class){
            this.dataS.addData(ctx.ID().getText(), new java.lang.String(temp.toString()));
        }
        else if (temp.getClass()== ArrayList.class){
            this.dataS.addData(ctx.ID().getText(), (ArrayList)temp);
        }
        else if (temp.getClass()== Hash.class){
            this.dataS.addData(ctx.ID().getText(), (Hash)temp);
        }
        return null;
    }

    @Override
    public Object visitReturnStatNodo(MyParser.ReturnStatNodoContext ctx) {

        visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitEspressionStatNodo(MyParser.EspressionStatNodoContext ctx) {

        visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitExpressionNodo(MyParser.ExpressionNodoContext ctx) {


        visit(ctx.additionExpression());
        visit(ctx.comparison());
        return null;
    }

    @Override
    public Object visitComparisionNodo(MyParser.ComparisionNodoContext ctx) {
        if(ctx.additionExpression().size()!=0){
            Object v1=evalStack.popValue();
            for(MyParser.AdditionExpressionContext ele : ctx.additionExpression()) {
                visit(ele);
            }
            Object v2=evalStack.popValue();
            if(v2.getClass()==v1.getClass()){
                if(ctx.IGIG().size()!=0){
                    if(v1.getClass()==Integer.class){
                        System.out.println(v1+" y "+v2);
                        if(Integer.parseInt(v1.toString())==Integer.parseInt(v2.toString())){
                            evalStack.pushValue(true);
                        }
                        else evalStack.pushValue(false);
                    }
                    else if(v1.getClass()== java.lang.String.class){
                        System.out.println(v1+" y "+v2);
                        if((java.lang.String)v1==(java.lang.String)v2){
                            evalStack.pushValue(true);
                        }
                        else evalStack.pushValue(false);
                    }
                    if(v1.getClass()==ArrayList.class){
                        System.out.println(v1+" y "+v2);
                        if((ArrayList)v1==(ArrayList) v2){
                            evalStack.pushValue(true);
                        }
                        else evalStack.pushValue(false);
                    }
                }
                else if(ctx.MAY().size()!=0){
                    if((Integer)v1 > (Integer) v2) { // solo acepta comparacion de numeros enteros
                        evalStack.pushValue(true);
                    }else evalStack.pushValue(false);
                }
                else if(ctx.MEN().size()!=0){
                    if((Integer)v1 < (Integer) v2) { // solo acepta comparacion de numeros enteros
                        evalStack.pushValue(true);
                    }else evalStack.pushValue(false);
                }
                else if(ctx.MAYI().size()!=0){
                    if((Integer)v1 >= (Integer) v2) { // solo acepta comparacion de numeros enteros
                        evalStack.pushValue(true);
                    }else evalStack.pushValue(false);
                }
                else if(ctx.MENI().size()!=0){
                    if((Integer)v1 <= (Integer) v2) { // solo acepta comparacion de numeros enteros
                        evalStack.pushValue(true);
                    }else evalStack.pushValue(false);
                }
            }else{
                evalStack.pushValue(false);
            }

        }
        return null;
    }

    @Override
    public Object visitAddExprNodo(MyParser.AddExprNodoContext ctx) {

        visit(ctx.multiplicationExpression());
        if(!ctx.additionFactor().getText().isEmpty()){
            visit(ctx.additionFactor());
        }
        return null;
    }

    @Override
    public Object visitAddFactNodo(MyParser.AddFactNodoContext ctx) {
        //int val1=(Integer)evalStack.popValue();
        int val1;
        java.lang.String var1;

        Object temp=evalStack.popValue();
        if(temp.getClass()==Integer.class){
            val1=(Integer)temp;
            int val2;
            for(int i=0; i<ctx.multiplicationExpression().size(); i++){
                visit(ctx.multiplicationExpression(i)); //meto pila
                val2=(Integer)evalStack.popValue();
                if(ctx.SUM(i)!=null){
                    val1=val1+val2;
                    evalStack.pushValue(val1);
                }
                else{
                    val1=val1-val2;
                    evalStack.pushValue(val1);
                }
            }
        }else{
            var1= (java.lang.String) temp;
            java.lang.String var2;
            for(int i=0; i<ctx.multiplicationExpression().size(); i++){
                visit(ctx.multiplicationExpression(i)); //meto pila
                var2=(java.lang.String) evalStack.popValue();
                if(ctx.SUM(i)!=null){
                    var1 = var1 + var2;
                    evalStack.pushValue(var1);
                }else{
                    evalStack.pushValue(var1);
                }
            }
        }

        return null;
    }

    @Override
    public Object visitMultExprNodo(MyParser.MultExprNodoContext ctx) {

        visit(ctx.elementExpression());
        if(!ctx.multiplicationFactor().getText().isEmpty()){
            visit(ctx.multiplicationFactor());
        }
        return null;
    }

    @Override
    public Object visitMultFactNodo(MyParser.MultFactNodoContext ctx) {
        int val1=(Integer)evalStack.popValue();
        int val2;
        for(int i=0; i<ctx.elementExpression().size(); i++){
            visit(ctx.elementExpression(i)); //meto pila
            val2=(Integer)evalStack.popValue();
            if(ctx.MUL(i)!=null){
                val1=val1*val2;
                evalStack.pushValue(val1);
            }
            else{
                val1=val1/val2;
                evalStack.pushValue(val1);
            }

        }
        return null;

    }

    @Override
    public Object visitElemtExprNodo(MyParser.ElemtExprNodoContext ctx) {
        visit(ctx.primitiveExpression());
        if(ctx.elementAccess()!=null){
            visit(ctx.elementAccess());
        }
        if(ctx.callExpression()!=null){
            visit(ctx.callExpression());
        }

        return null;
    }

    @Override
    public Object visitEletAccNodo(MyParser.EletAccNodoContext ctx) {
        visit(ctx.expression()); // hay 2 valores en la pila  indice y la lista
        Object index=evalStack.popValue();
        System.out.println("index:"+index);
        ArrayList id=(ArrayList) evalStack.popValue();
        System.out.println("id:"+id);

        Object result=-1; // si el indice es invalido mete -1 en la pila
        if(id.get(0).getClass()==Hash.class ){
            ArrayList<Hash> i=id;
            for(Hash h: i ){
                if(h.clave==index) result=h.valor;
            }
            evalStack.pushValue(result);
        }else{
            int len=0;
            for(Object o: id){
                len++;
            }
            if(len > (Integer) index){
                result=id.get((Integer)index);
                evalStack.pushValue(result);
            }else{
                evalStack.pushValue(result);
                java.lang.String Mymsg="Error linea " + ctx.PCI().getSymbol().getLine() + ", Indice ["+index+"] fuera de rango.";
                defaultListModel.addElement(Mymsg);
            }

        }
        return null;
    }

    @Override
    public Object visitCallExpNodo(MyParser.CallExpNodoContext ctx) {

        visit(ctx.expressionList());
        return null;
    }

    @Override
    public Object visitPeInt(MyParser.PeIntContext ctx) {

        int v=Integer.parseInt(ctx.INTEGER().getText());
        evalStack.pushValue(v);
        return null;
    }

    @Override
    public Object visitPeStr(MyParser.PeStrContext ctx) {

        evalStack.pushValue(ctx.STRING().getText());
        return null;
    }

    @Override
    public Object visitPeID(MyParser.PeIDContext ctx) {

        //int valor=(Integer)
        Object temp=dataS.getData(ctx.ID().getText()).value;
        if(temp.getClass()==Integer.class){
            evalStack.pushValue(temp);
        }
        else if(temp.getClass()== java.lang.String.class){
            evalStack.pushValue(temp);
        }
        else if(temp.getClass()== Boolean.class){
            evalStack.pushValue(temp);
        }
        else if(temp.getClass()== ArrayList.class){
            evalStack.pushValue(temp);
            return temp;
        }


        return null;
    }

    @Override
    public Object visitPeTrue(MyParser.PeTrueContext ctx) {
        evalStack.pushValue(true);
        return null;
    }

    @Override
    public Object visitPrFalse(MyParser.PrFalseContext ctx) {
        evalStack.pushValue(false);
        return null;
    }

    @Override
    public Object visitPeParExpre(MyParser.PeParExpreContext ctx) {
        visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitPeArrLit(MyParser.PeArrLitContext ctx) {
        visit(ctx.arrayLiteral());

        return null;
    }

    @Override
    public Object visitPeArrFuntExpL(MyParser.PeArrFuntExpLContext ctx) {

        java.lang.String variable=ctx.expressionList().getText(); //para encontrar el identificador de la lista
        char[] listaVariable= variable.toCharArray();
        char var=listaVariable[0];

        int arrf=(Integer) visit(ctx.arrayFunctions());

        if(arrf==5){
            Object temp=dataS.getData(Character.toString(var));
            // cuando visito expression list en la pila quedan todos los valores
            visit(ctx.expressionList());
            ArrayList<Object> lista= (ArrayList<Object>) evalStack.popValue();
            ArrayList<Object> arreglo =(ArrayList)lista.get(0);// a esta lista se le agrega los otros valores
            int index=0;
            for(Object o:lista){
                if(index > 0){
                    arreglo.add(lista.get(index));
                }
                index++;
            }
            ((DataStorage.Value) temp).value=arreglo;
        }
        else if(arrf==4){
            Object temp=dataS.getData(Character.toString(var));
            // cuando visito expression list en la pila quedan todos los valores
            visit(ctx.expressionList());
            ArrayList<Object> lista= (ArrayList<Object>) evalStack.popValue();
            ArrayList<Object> arreglo =(ArrayList)lista.get(0);// a esta lista se le debe quitar los otros valores
            ArrayList<Object> toRest =new ArrayList<>();

            int index=0;
            for(Object o:lista){
                if(index > 0){
                    toRest.add(lista.get(index));
                }
                index++;
            }

            for(Object i:toRest){
                arreglo.remove(i);
            }
            ((DataStorage.Value) temp).value=arreglo;
        }
        else{
            ArrayList<Object> arrayList = (ArrayList<Object>) visit(ctx.expressionList());
            int len=(Integer)arrayList.get(1);
            Object last=arrayList.get(0);
            Object first=arrayList.get(2);
            int contador=0;
            if(len==1){
                ArrayList<Object> tidl= (ArrayList<Object>) evalStack.popValue();
                ArrayList<Object> lista=(ArrayList)tidl.get(0);
                for( Object o: lista){
                    contador++;
                }
                len=contador;
                last=lista.get(contador-1);
                first=lista.get(0);

                if(arrf==1){
                    evalStack.pushValue(len);
                }else if(arrf==2){
                    evalStack.pushValue(first);
                }else if(arrf==3){
                    evalStack.pushValue(last);
                }
            }
            else{
                if(arrf==1){
                    evalStack.pushValue(len);
                }else if(arrf==2){
                    evalStack.pushValue(first);
                }else if(arrf==3){
                    evalStack.pushValue(last);
                }
            }
        }
        return null;
    }

    @Override
    public Object visitPeFuntLit(MyParser.PeFuntLitContext ctx) {

        visit(ctx.functionLiteral());
        return null;
    }

    @Override
    public Object visitPeHashLit(MyParser.PeHashLitContext ctx) {

        visit(ctx.hashLiteral()); // en la pia quedan puros hash

        ArrayList<Hash> diccionario =new ArrayList<>();
        while (!evalStack.vacia()){
            Object val=evalStack.popValue();
            if(val.getClass()==Hash.class){
                System.out.println("tipo:::"+val.getClass());
                diccionario.add((Hash)val);
            }else {
                evalStack.pushValue(val);
                break;
            }
        }

        evalStack.pushValue(diccionario);

        return null;
    }

    @Override
    public Object visitPePrintExp(MyParser.PePrintExpContext ctx) {

        visit(ctx.printExpression());
        return null;
    }

    @Override
    public Object visitPeIfExp(MyParser.PeIfExpContext ctx) {

        visit(ctx.ifExpression());
        return null;
    }

    @Override
    public Object visitArrLen(MyParser.ArrLenContext ctx) {

        return 1;
    }

    @Override
    public Object visitArrFirst(MyParser.ArrFirstContext ctx) {

        return 2;
    }

    @Override
    public Object visitArrLast(MyParser.ArrLastContext ctx) {

        return 3;
    }

    @Override
    public Object visitArrRest(MyParser.ArrRestContext ctx) {
        return 4;
    }

    @Override
    public Object visitArrPush(MyParser.ArrPushContext ctx) {

        return 5;
    }

    @Override
    public Object visitArrLit(MyParser.ArrLitContext ctx) {
        visit(ctx.expressionList());
        return null;
    }

    @Override
    public Object visitFuntLitNodo(MyParser.FuntLitNodoContext ctx) {
        System.out.println("Funcion: "+ctx.getText());
        //visit(ctx.functionParameters()); // queda en el local storage las vriales incializadas
        //visit(ctx.blockStatement());
        evalStack.pushValue(ctx.getText());
        return null;
    }

    @Override
    public Object visitFuntParaNodo(MyParser.FuntParaNodoContext ctx) {
        this.dataS.addData(ctx.ID().getText(),new Integer(0));
        visit(ctx.moreIdentifiers());
        return null;
    }

    @Override
    public Object visitMoreIdNodo(MyParser.MoreIdNodoContext ctx) {
        evalStack.pushValue(0);

        for(TerminalNode ele: ctx.ID()){
            this.dataS.addData(ele.getText(),new Integer(0));
        }
        return null;
    }

    @Override
    public Object visitHashLitNodo(MyParser.HashLitNodoContext ctx) {
        visit(ctx.hashContent());
        visit(ctx.moreHashContent());
        return null;
    }

    @Override
    public Object visitHashContNodo(MyParser.HashContNodoContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        // hay dos valores metidos en la pila
        Object valor=evalStack.popValue();
        Object clave=evalStack.popValue();
        Hash var=new Hash(clave,valor);
        evalStack.pushValue(var);

        return null;
    }

    @Override
    public Object visitMoreHCNodo(MyParser.MoreHCNodoContext ctx) {
        for(MyParser.HashContentContext ele: ctx.hashContent()){
            visit(ele);
        }
        return null;
    }

    @Override
    public Object visitExpListllena(MyParser.ExpListllenaContext ctx) {
        visit(ctx.expression());

        ArrayList<Object> arrayList = (ArrayList<Object>) visit(ctx.moreExpressions());
        ArrayList<Object> arrLit = new ArrayList<Object>();
        arrayList.add(2,ctx.expression().getText()); // first
        int len= (int) arrayList.get(1);
        while((len > 0)&&(!evalStack.vacia()) ){
            arrLit.add(0,evalStack.popValue()); //lista con los elementos para asignacion
            len--;
        }
        evalStack.pushValue(arrLit);
        return arrayList; // lista con valores de len, fist y last
    }

    @Override
    public Object visitExpListVacia(MyParser.ExpListVaciaContext ctx) {
        ArrayList<Object> arrLit = new ArrayList<Object>();
        evalStack.pushValue(arrLit);
        return null;
    }

    @Override
    public Object visitMorExpNodo(MyParser.MorExpNodoContext ctx) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int cont=1;
        Object last=0;
        for(MyParser.ExpressionContext ele: ctx.expression()){
            cont++;
            last=ele.getText(); // en la pocicion 0 queda el last
            visit(ele);
        }
        arrayList.add(last);
        arrayList.add(cont); // representa el len

        return arrayList;
    }

    @Override
    public Object visitPrintExpNodo(MyParser.PrintExpNodoContext ctx) {

        visit(ctx.expression()); // agrega a la pila
        java.lang.String Mymsg="System: ";
        Object val=evalStack.popValue();
        if(val.getClass()==ArrayList.class){
            ArrayList<Object> lista =(ArrayList)val;
            if(lista.get(0).getClass()==Hash.class){
                ArrayList<Hash> hash = new ArrayList<>();
                for(Object o:lista){
                    hash.add((Hash)o);
                }
                for(Hash h:hash){
                    Mymsg=Mymsg + h.clave+":"+h.valor+",";
                }
            }else{
                Mymsg=Mymsg + val;
            }
        }else{
            Mymsg=Mymsg + val;
        }

        defaultListModel.addElement(Mymsg);
        return null;
    }

    @Override
    public Object visitIfExpNodo(MyParser.IfExpNodoContext ctx) {
        visit(ctx.expression());
        boolean cond2=(Boolean)evalStack.popValue();

        if(cond2==true){
            visit(ctx.blockStatement(0));
        }else{
            if(ctx.blockStatement(1)!=null){
                visit(ctx.blockStatement(1));
            }
        }
        return null;
    }

    @Override
    public Object visitBlkStatNodo(MyParser.BlkStatNodoContext ctx) {
        for(MyParser.StatementContext ele: ctx.statement()){
            visit(ele);
        }
        return null;
    }

    @Override
    public Object visitOpSum(MyParser.OpSumContext ctx) {
        return null;
    }

    @Override
    public Object visitOpSub(MyParser.OpSubContext ctx) {
        return null;
    }

    @Override
    public Object visitOpMul(MyParser.OpMulContext ctx) {
        return null;
    }

    @Override
    public Object visitOpDiv(MyParser.OpDivContext ctx) {
        return null;
    }
}
