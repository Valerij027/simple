package Swing.SwingBegin;

import javax.swing.*;
import java.awt.*;

/**
 * Created by АбельянцX on 05.07.2016.
 */
public class SwingDemo {
    SwingDemo() {
        JFrame jFrame = new JFrame("Simple Swing application ");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);

        JLabel label=new JLabel("ее");
        jFrame.add(BorderLayout.CENTER,label);
        jFrame.setVisible(true);
    }
public static void main(String args[]){
    SwingUtilities.invokeLater(new Runnable(){

        public void run(){
            new SwingDemo();
        }
    });
}
}

