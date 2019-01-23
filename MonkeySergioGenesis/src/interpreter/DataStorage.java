package interpreter;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataStorage {

    private LinkedList<Value> data;
    private int actualIndex;

    public class Value{
        String name;
        Object value;

        public Value(String n, Object v, int i) {
            this.name = new String(n);
            this.value = v;
        }
    }

    public DataStorage()
    {
        this.actualIndex = 0;
        this.data = new LinkedList<Value>();
    }

    public void addData(String nombre, Object value)
    {
        Value v = new Value(nombre,value,this.actualIndex);
        this.data.add(v);
        this.actualIndex++;
    }

   /* public Value getData(int index) {
        return this.data.get(index);
    }*/

    public Value getData(String name) {
        //se debe buscar en la tabla pero por nombre
        Value temp=new Value("no declarada",2,4);
        for(Value id : this.data)
            if (id.name.equals(name)) {
                temp = id;
                break;
            }
        return temp;
    }


    public void cleanData(){
        while (this.data.size()!=0)
            this.data.pop();
        this.actualIndex=0;
    }

    public String toString() {
        String message = new String("");
        message += "****** ESTADO DE DATA STORAGE ******\n";
        if (!this.data.isEmpty()) {
            for (Value i : this.data) {
                message += i.name + " --> " + i.value + "\n";
            }
            message += "------------------------------------------";
        } else
            message += "Data Storage is Empty!!";
        return message;
    }

    public int getActualStorageIndex(){
        return this.actualIndex;
    }
    public LinkedList<Value> getData() {
        return this.data;
    }
}
