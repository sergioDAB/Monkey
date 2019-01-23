package Vista;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Arrieta on 22/3/2017.
 */
public class TabPanel extends JPanel implements ActionListener{
    JPopupMenu popupMenu;
    JMenuItem pCopiar;
    JMenuItem pCortar;
    JMenuItem pPegar;
    JTextArea codigo;
    public TabPanel(JLabel information) {
        this.setLayout(new BorderLayout(1,1));
        JPanel subPanel= new JPanel();
        subPanel.setLayout(new BorderLayout(1,1));

        JPanel subSubPanel= new JPanel();
        subSubPanel.setLayout(new BorderLayout(1,1));
        //subSubPanel.setBackground(Color.green);





        codigo= new JTextArea(24,24);

        popupMenu=new JPopupMenu();
        pCopiar= new JMenuItem("Copiar");
        pCopiar.addActionListener(this);
        pCortar= new JMenuItem("Cortar");
        pCortar.addActionListener(this);
        pPegar= new JMenuItem("Pegar");
        pPegar.addActionListener(this);
        popupMenu.add(pCopiar);
        popupMenu.add(pCortar);
        popupMenu.add(pPegar);
        codigo.setComponentPopupMenu(popupMenu);
//        codigo.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//                    numLin++;
//                    txtNumLineas.append(numLin + "\n");
//                } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_DELETE) {
//                    guardaFilas();
//                    txtNumLineas.setText("");
//                    numLin = 1;
//                    for (String s : filas) {
//                        txtNumLineas.append(numLin + "\n");
//                        numLin++;
//                    }
//                    numLin--;
//                    if (codigo.getText().equals("")) {
//                        numero.append(1 + "\n");
//                        numLin = 1;
//                    }
//                }
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });

        JTextArea numero= new JTextArea("1\n");
        numero.setPreferredSize(new Dimension(50,-1));
        numero.setBackground(Color.lightGray);
        numero.setEditable(false);

        subSubPanel.add(numero);
        subPanel.add(subSubPanel,BorderLayout.WEST);
        subPanel.add(codigo);

        JScrollPane scrollPane = new JScrollPane(subPanel);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(scrollPane, BorderLayout.CENTER);
        codigo.addCaretListener(e -> {
            int pos = e.getDot();
            try {
                int row = codigo.getLineOfOffset( pos ) + 1;
                int col = pos - codigo.getLineStartOffset( row - 1 ) + 1;
                information.setText("Línea: " + row + " Columna: " + col );
            }
            catch( BadLocationException exc ){
                System.out.println(exc);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pCopiar) {
            this.codigo.copy();
        }else if(e.getSource() == pPegar){
            this.codigo.paste();
        }else if(e.getSource() == pCortar){
            this.codigo.cut();
        }
    }
}
