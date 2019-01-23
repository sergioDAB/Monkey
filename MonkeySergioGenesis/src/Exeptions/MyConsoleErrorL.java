package Exeptions;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import Vista.*;

import javax.swing.*;

public class MyConsoleErrorL  extends ConsoleErrorListener{
    DefaultListModel defaultListModel;
    public MyConsoleErrorL(JList list) {

        super();
        defaultListModel=(DefaultListModel) list.getModel();
    }

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String Mymsg;
        System.err.println("linea " + line + ":" + (charPositionInLine+1) + " " + msg);
        Mymsg="Error de sintaxis en  " + line + ":" + (charPositionInLine+1) + " " + msg;
        defaultListModel.addElement(Mymsg);

    }
}
