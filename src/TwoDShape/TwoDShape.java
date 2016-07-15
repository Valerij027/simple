package TwoDShape;

/**
 * Created by АбельянцX on 24.06.2016.
 */
 abstract public class TwoDShape {

    private double width;
    private double height;


    TwoDShape(){
        width=height=0;
    }
    TwoDShape(double w,double h){
        width=w;
        height=h;
    }
    TwoDShape(double x){
        width=height=x;
    }
    TwoDShape(TwoDShape ob){
        width=ob.width;
        height=ob.height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    void showDim(){
        System.out.println("Ширина= " +width+"\nВысота = "+height);
    }

    abstract double area();
    abstract void name();
}

