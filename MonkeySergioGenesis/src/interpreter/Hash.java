package interpreter;


import java.util.ArrayList;

public class Hash {

    Object clave;
    Object valor;

    public Hash(Object clave, Object valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public  String imprimir(){
        String msg=(this.clave+" : "+this.valor);
        return msg;
    }

}


