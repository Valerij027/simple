package Swing.task16_19;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by АбельянцX on 07.07.2016.
 */
public class SwingHelp implements ListSelectionListener{
    JList<String> jList;
    JScrollPane jScrollPane;
    JLabel jLabel;
    String name[]={"if","switch","for","while","do","break","continue"};

    SwingHelp(){
        JFrame jFrame=new JFrame("Help");
        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());

        jList=new JList<String>(name);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane=new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(120,90));

        jLabel=new JLabel("");

        jList.addListSelectionListener(this);

        jFrame.add(jScrollPane);
        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }
    public void valueChanged(ListSelectionEvent listSelectionEvent){
        int ind=0;
        int i=jList.getSelectedIndex();
        Help help=new Help(name[i]);
        jLabel.setText(help.helpOn(name[i]));
    }
public static void main(String args[]){
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new SwingHelp();
        }
    });
}

}
