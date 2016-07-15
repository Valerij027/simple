package TwoDShape;

/**
 * Created by АбельянцX on 24.06.2016.
 */
public class Shapes {
    public static void main(String args[]){
       TwoDShape shapes[]=new TwoDShape[3];

        shapes[0]=new Triangle(4,7,"контурный");
        shapes[1]=new Triangle(10);
        shapes[2]=new Rectangle(20);


        for (int i=0;i<=2;i++){
            shapes[i].name();
            System.out.println("  "+shapes[i].area());
        }
    }
}
