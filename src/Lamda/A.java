package Lamda;

import java.util.Random;

/**
 * Created by АбельянцX on 03.07.2016.
 */
public class A {
    public int getU() {
        return u;
    }

    private int u;

    A(int i){
        u=i;
    }
boolean isFactor(int r){
    boolean result=false;
    if(u%r==0)result=true;
    return result;
}
    static void isFactor2(int i){
        Random r=new Random();
        int y=r.nextInt(3)+1;

        if(i<y){
            System.out.println(i+" меньше "+y);
        }
        else if(i>y) System.out.println(i+" больше "+y);
        else  System.out.println(i+" равно "+y);
    }
}

