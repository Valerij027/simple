package Swing.SwingBegin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by АбельянцX on 06.07.2016.
 */
public class CheckBox implements ItemListener {
    JCheckBox alpha;
    JCheckBox beta;
    JLabel label;
    JLabel label1;
    CheckBox() {
        JFrame jFrame = new JFrame();
        alpha = new JCheckBox("Alpha");
        beta = new JCheckBox("Beta");
        label=new JLabel("");
        label1=new JLabel("");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setSize(300,300);
        jFrame.setLayout(new FlowLayout());

        alpha.addItemListener(this);
        beta.addItemListener(this);

        jFrame.add(alpha);
        jFrame.add(beta);
        jFrame.add(label);
        jFrame.add(label1);

        jFrame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent itemEvent){
       String str="";
        JCheckBox checkBox=(JCheckBox) itemEvent.getItem();
        if(checkBox.isSelected()){
           label.setText(checkBox.getText()+" was just selected");
        }else label.setText(checkBox.getText()+"was just cleared");
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new CheckBox();
            }
        });
    }
}