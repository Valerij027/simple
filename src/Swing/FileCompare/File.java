package Swing.FileCompare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by АбельянцX on 06.07.2016.
 */
public class File implements ActionListener {
    JLabel jLabel,jLabel1,jLabel2,jLabel3;
    JTextField text,text1;
    JButton button;
    JCheckBox checkBox;
    int u=0,z=0;
    File() {
        JFrame jFrame = new JFrame("CompareFile");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("    compare    ");
        text = new JTextField(10);
        text1 = new JTextField(10);
        jLabel = new JLabel("Введите имя первого файла.");
        jLabel1 = new JLabel("Введите имя второго файла.");
        jLabel2 = new JLabel("");
        jLabel3=new JLabel("");

        checkBox=new JCheckBox();
        checkBox.setVisible(false);
        jFrame.setSize(350,200);

        button.addActionListener(this);
        text.addActionListener(this);
        text1.addActionListener(this);
        checkBox.addItemListener((ae)->{
            if(checkBox.isSelected()){
                jLabel3.setText("Difference of files in  "+z+" items");
                jLabel3.setVisible(true);
            }
            else jLabel3.setVisible(false);
        });

        jFrame.add(jLabel);
        jFrame.add(text);
        jFrame.add(jLabel1);
        jFrame.add(text1);
        jFrame.add(button);
        jFrame.add(jLabel2);
        jFrame.add(checkBox);
        jFrame.add(jLabel3);

        jFrame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
            try{
                FileInputStream f=new FileInputStream(text.getText());
                FileInputStream f1=new FileInputStream(text1.getText());
                int i=0,j=0;
                do{
                    i=f.read();
                    j=f1.read();
                    u++;
                    if(i!=j){
                        break;
                    }

                } while (i!=-1&&j!=-1);
               if(i!=j) {
                   jLabel2.setText("Files not equals");
               }
                else jLabel2.setText("Files equals");


            }catch (IOException e){
                jLabel2.setText("File ERROR");
            }
        z=u;
        u=0;
        checkBox.setVisible(true);
        }


    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new File();
            }
        });


    }
}
