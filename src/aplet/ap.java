package aplet;

import java.applet.Applet;
import java.awt.*;


public class ap extends Applet implements Runnable{

    String mas="Java";
    Thread t;
    boolean stopflag;
    private int i=0,j=0;

    public void init(){
        t=null;
    }
    public void start(){
        t=new Thread(this);
        stopflag=false;
        t.start();
    }
    public void run(){
        for(;;){
            try {
                repaint();
                Thread.sleep(20);
                if(stopflag)
                    break;
            }catch (InterruptedException e){
                System.out.println(e.toString());
            }
        }
    }
    public void stop(){
        stopflag=true;
        t=null;
    }
    public void paint(Graphics graphics){
        i++;
        if(i==300){
            j=j+10;
            i=0;
        }
        if(j==300)j=0;
        graphics.drawString(mas,50+i,30+j);
    }
}
