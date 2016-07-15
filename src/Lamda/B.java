package Lamda;

/**
 * Created by АбельянцX on 04.07.2016.
 */
public class B {
    private int first;
    B(int r){
        first=r;
    }

    boolean isF(int t){
        boolean result=false;
        for (int i=2;i<=first;i++){

            if((first%i==0)&(t%i==0)) {
            result = true;
                System.out.println("Наименьшим общим делителем является "+i);
            break;

            }
        }
        return result;
    }
}
