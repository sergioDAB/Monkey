package Modelo;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

/**
 * Created by f1419 on 30/3/2017.
 */
public class MyTreeCellRenderer extends DefaultTreeCellRenderer {
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
                                                  boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree,value,sel,expanded,leaf,row,hasFocus);
        System.out.println(tree.getModel().getRoot().toString());
        if (tree.getModel().getRoot().equals((DefaultMutableTreeNode)value)){
            setIcon(new ImageIcon(getClass().getResource("/Imagenes/tree.png")));
        }else if(tree.getModel().isLeaf(value)){
            setIcon(new ImageIcon(getClass().getResource("/Imagenes/leaf.png")));
        }else{
            setIcon(new ImageIcon(getClass().getResource("/Imagenes/branch.png")));
        }
        return this;
    }
}
