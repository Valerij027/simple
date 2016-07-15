package EnumCar;

/**
 * Created by АбельянцX on 30.06.2016.
 */
enum Car{
    HAMMER,WRENCH,PlIERS,SCREWDRIVER
}
public class EnumCar {
    public static void main(String args[]){
        for(Car r:Car.values())System.out.println(r);
    System.out.println(Car.valueOf("HAMMER").ordinal()+"   ");

    }

}
