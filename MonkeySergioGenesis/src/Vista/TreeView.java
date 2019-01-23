package Vista;

import Modelo.TreeVisitorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Arrieta on 30/3/2017.
 */
public class TreeView extends JFrame {
    private JPanel panel;
    private JButton btnAceptar;
    private JTree tree;




    public TreeView(ParseTree parseTree) {
        initComponents();
       // TreeVisitorNode treeVisitorNode =new TreeVisitorNode(tree);
        //treeVisitorNode.visit(parseTree);
    }
    private void initComponents() {
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setMinimumSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        btnAceptar.addActionListener(e -> this.dispose());
    }
}
