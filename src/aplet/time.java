package aplet;

import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

/**
 * Created by АбельянцX on 05.07.2016.
 */
public class time extends Applet implements Runnable {
    String str="q";
    Calendar clock;
    Thread t;


    public void init() {
        t = null;
        str="";
    }
    public void start(){
        t=new Thread(this);
        t.start();
    }
    public void run() {
        for (; ; ) {
            try {
                repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void paint(Graphics g){
        clock=Calendar.getInstance();
        str="Текущее время: "+Integer.toString(clock.HOUR);
        str=str+" : "+Integer.toString(clock.MINUTE);
        str=str+" : "+Integer.toString(clock.SECOND);
        g.drawString(str,10,10);
    }

}
