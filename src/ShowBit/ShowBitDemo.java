package ShowBit;

/**
 * Created by АбельянцX on 26.05.2016.
 */
public class ShowBitDemo {
    public static void main(String args[]){
        ShowBit b = new ShowBit(8);
        ShowBit i = new ShowBit(32);
        ShowBit li = new ShowBit(64);

        System.out.println("123 в двоичном представлении:");
        b.show(123);
        System.out.println("\n 87987 в двоичном представлении:");
        i.show(87987);
        System.out.println("\n 237658768 в двоичном представлении:");
        li.show(237658768);


    }
}
