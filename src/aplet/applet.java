package aplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by АбельянцX on 04.07.2016.
 */
public class applet extends Applet implements MouseListener,MouseMotionListener,MouseWheelListener {
    String str ="";
    int x,y,w,e,r,t,u=0;
    boolean draw;
    boolean amount=false;

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        draw=false;
    }

    public void mouseClicked(MouseEvent me){
        x=10;
        y=10;
        str="Mouse clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent me){
        x=10;
        y=10;
        str="Mouse entered";
        repaint();
    }
    public void mouseExited(MouseEvent me){
        x=10;
        y=10;
        str="Mouse exited";
        repaint();
    }
    public void mousePressed(MouseEvent me){
        draw=true;
        w=me.getX();
        e=me.getY();
        str="Down";
    }
    public void mouseReleased(MouseEvent me){
        draw=false;
        x=me.getX();
        y=me.getY();
        str="Up";

    }
    public void mouseDragged(MouseEvent me){
        draw=true;
        r=me.getX();
        t=me.getY();
        x=me.getX();
        y=me.getY();
        str="*";
        showStatus("Dragging mouse at "+me.getX()+" , "+me.getY());
        repaint();

    }

    public void mouseMoved(MouseEvent me){
        showStatus("Moving mouse at "+me.getX()+" , "+me.getY());
    }
    public void  mouseWheelMoved(MouseWheelEvent me){
       amount=true;
        double p=-me.getPreciseWheelRotation();
        u+=p;
        str=Double.toString(p)+"   "+u;
        repaint();
    }
    public void paint(Graphics graphics){
        graphics.drawString(str,x,y);
        if(draw)graphics.drawLine(w,e,r,t);

    }
}
