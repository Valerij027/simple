package TwoDShape;

/**
 * Created by АбельянцX on 24.06.2016.
 */
public class Triangle extends TwoDShape {

    private String style;

    Triangle(){
        super();
        style="none";
    }

    Triangle(double x){
        super(x);
        style="контурный";
    }
    Triangle(double w,double h,String str){
        super(w,h);
        style=str;
    }
    Triangle(Triangle ob){
        super(ob);
        style=ob.style;
    }
    double area(){
        double area=getWidth()*getHeight()/2;
        return area;
    }
    void name(){
        System.out.print("Треугольник");

    }

}
