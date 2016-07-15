package TwoDShape;

/**
 * Created by АбельянцX on 24.06.2016.
 */
public class Rectangle extends TwoDShape {
    Rectangle(){
        super();
    }
    Rectangle(double x){
        super(x);
    }
    Rectangle(double x,double y){
        super(x,y);
    }
    Rectangle(Rectangle ob){
        super(ob);
    }
    double area(){
        return getHeight()*getWidth();
    }
    boolean isSquare(){
        if(getWidth()==getHeight())return  true;
        return false;
    }
    void name(){
        System.out.print("Прямоугольник");
    }
}
