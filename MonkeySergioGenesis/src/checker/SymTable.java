package checker;

import org.antlr.v4.runtime.*;
import java.util.LinkedList;
import checker.Checker;

public class SymTable {
    private LinkedList<Ident> tabla;
    private  LinkedList<Function> tablaF;
    private int nivelActual;


    public class Ident{
        int nivel;
        Token tok;
        int type; //0 -> entero,  1 ->  string    2-> booleano  3-> list  4-> hash  5-> neutro
        //si el tipo no es ninguno de estos, se puede decir que es una operacin invalida.
        ParserRuleContext decl; //por si fuera necesario saber más acerca del contexto del identificador en el árbol

        public Ident(int n, Token t, int ty, ParserRuleContext d) {
            nivel = n;
            tok = t;
            type = ty;
            decl = d;
        }

        public String toString(){
            return this.tok.getText() + "," + this.nivel;
        }
    }

    public class Function{
        int nivel;
        Token tok;
        int type; //5-> neutro   6-> func(sin tipo)
        int args;
        ParserRuleContext decl; //por si fuera necesario saber más acerca del contexto del identificador en el árbol

        public Function(int n, Token t, int ty,int a, ParserRuleContext d) {
            nivel = n;
            tok = t;
            type = ty;
            args=a;
            decl = d;
        }

        public String toString(){
            return this.tok.getText() + "," + this.nivel;
        }
    }

    public boolean bloqueMetodoAbierto=false;
    public boolean dentrodeFuncion=false;
    public String tipos[]={"Entero","texto","Booleano","arreglo","hash","neutro","funcion"};
    public boolean variableRepetida=false;
    public int tempNivelActual=nivelActual;

    public SymTable()
    {
        this.nivelActual = -1;
        this.tabla = new LinkedList<Ident>();
        this.tablaF=new LinkedList<Function>();
    }

    //funciones para la insercion de variables

    public Ident insertar(String nombre, int tipo, ParserRuleContext declaracion)
    {
        variableRepetida=false;
        Token token = new CommonToken(0,nombre);
        Ident i = new Ident(nivelActual,token,tipo,declaracion);
        int j = 0;
        while (j < this.tabla.size() && this.tabla.get(j).nivel == nivelActual) {
            if (this.tabla.get(j).tok.getText().equals(nombre)) {
                System.out.println("El identificador " + nombre + " ya ha sido declarado!!!");
                variableRepetida=true;
                return null;
            }
            j++;
        }
        this.tabla.push(i); //deben ser una tabla estilo pila
        return this.tabla.get(0);
    }

    public Ident insertar(Token token, int tipo, ParserRuleContext declaracion)
    {
        variableRepetida=false;
        Ident i = new Ident(nivelActual,token,tipo,declaracion);
        int j = 0;
        while (j < this.tabla.size() && this.tabla.get(j).nivel == nivelActual) {
            if (this.tabla.get(j).tok.getText().equals(token.getText())) {
                System.out.println("El identificador " + token.getText() + " ya ha sido declarado. Line " + token.getLine() + ":" + token.getCharPositionInLine());
                variableRepetida=true;
                return null;
            }
            j++;
        }
        tabla.push(i); //deben ser una tabla estilo pila
        return this.tabla.get(0);

    }

    public void openScope(){

        tempNivelActual++;
        this.nivelActual++;
    }

    public void closeScope(){
        if(!this.tabla.isEmpty()){
            Ident element = this.tabla.get(0);
            while (element != null && element.nivel == nivelActual){
                tabla.pop();
                if(!this.tabla.isEmpty())
                    element = this.tabla.get(0);
                else
                    element= null;
            }
            this.nivelActual--;
            tempNivelActual--;
        }

    }

    public Ident buscar(String nombre)
    {
        Ident temp=null;
        for(Ident id : this.tabla)
            if (id.tok.getText().equals(nombre) && id.nivel <= this.nivelActual ) {
                temp = id;
                break;
            }
        return temp;
    }

    public void imprimir() {
        System.out.println("****** ESTADO DE TABLA DE SÍMBOLOS ******");
        if (!this.tabla.isEmpty()) {
            for (Ident i : this.tabla) {
                String nivel = "";
                for (int j = 0; j < i.nivel; j++) {
                    nivel += "\t";
                }
                System.out.println(nivel + "Nombre: " + i.tok.getText() + " - Nivel: " + i.nivel);
            }
            System.out.println("------------------------------------------");
        }
        else
            System.out.println("Tabla vacía");
    }

    public LinkedList<Ident> getTabla() {
        return this.tabla;
    }

    //funciones para la inserccion de funciones



    public Function insertarF(String nombre, int tipo,int arg, ParserRuleContext declaracion)
    {
        Token token = new CommonToken(0,nombre);
        Function i = new Function(nivelActual,token,tipo,arg,declaracion);
        int j = 0;
        while (j < this.tablaF.size() && this.tablaF.get(j).nivel == nivelActual) {
            if (this.tablaF.get(j).tok.getText().equals(nombre)) {
                System.out.println("La funcion " + nombre + " ya ha sido declarada");
                return null;
            }
            j++;
        }
        this.tablaF.push(i); //deben ser una tabla estilo pila
        return this.tablaF.get(0);
    }

    public Function insertarF(Token token, int tipo, int arg,ParserRuleContext declaracion)
    {
        Function i = new Function(nivelActual,token,tipo,arg,declaracion);
        int j = 0;
        while (j < this.tablaF.size() && this.tablaF.get(j).nivel == nivelActual) {
            if (this.tablaF.get(j).tok.getText().equals(token.getText())) {
                System.out.println("La funcion " + token.getText() + " ya ha sido declarada. Line " + token.getLine() + ":" + token.getCharPositionInLine());
                return null;
            }
            j++;
        }
        tablaF.push(i); //deben ser una tabla estilo pila
        return this.tablaF.get(0);

    }

    public void openScopeF(){
        this.nivelActual++;
    }

    public void closeScopeF(){
        Function element = this.tablaF.get(0);
        while (element != null && element.nivel == nivelActual){
            tablaF.pop();
            if(!this.tablaF.isEmpty())
                element = this.tablaF.get(0);
            else
                element= null;
        }
        this.nivelActual--;
    }

    public Function buscarF(String nombre)
    {
        Function temp=null;
        for(Function id : this.tablaF)
            if (id.tok.getText().equals(nombre) && id.nivel <= this.nivelActual ) {
                temp = id;
                break;
            }
        return temp;
    }

    public void imprimirF() {
        System.out.println(">>>>>> ESTADO DE TABLA DE FUNCIONES ******");
        if (!this.tablaF.isEmpty()) {
            for (Function i : this.tablaF) {
                String nivel = "";
                for (int j = 0; j < i.nivel; j++) {
                    nivel += "\t";
                }
                System.out.println(nivel + "-> Nombre: " + i.tok.getText() + "-> Nivel: " + i.nivel+ "-> argumentos: " + i.args);
            }
            System.out.println("------------------------------------------");
        }
        else
            System.out.println("Tabla vacía");
    }

    public LinkedList<Function> getTablaF() {
        return this.tablaF;
    }


    public int cantidadParametros=0;
}
