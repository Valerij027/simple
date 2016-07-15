package Swing.JList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by АбельянцX on 07.07.2016.
 */
public class List implements ListSelectionListener {

    JList<String> jList;
    String name[]={"Саша","Маша","Дима","Света","Бил","Андрей","Victor"};
    JScrollPane jScrollPane;
    JLabel jLabel;

    List(){
        JFrame jFrame=new JFrame("List");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200,200);

        jList=new JList<String>(name);

        jScrollPane=new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(120,90));

        //jList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); данная строка говорит о том что выбранные элементы листа допустимы только из оного интервала

        jLabel=new JLabel("");

        jList.addListSelectionListener(this);

        jFrame.add(jScrollPane);
        jFrame.add(jLabel);

        jFrame.setVisible(true);



    }
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        int i = 0;

        String str = "Selected items:", srt = "";
        int index[]=jList.getSelectedIndices();

        for(int t:index){
            srt += "  " + Integer.toString(t+1);
       }
      jLabel.setText(str+srt);
        srt = "";
    }


    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new List();
            }
        });
    }
}
