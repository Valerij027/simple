package Quicksort;

/**
 * Created by АбельянцX on 24.06.2016.
 */
public class QSDemo {
    public static void main(String args[]){
        char a[]={'g','k','s','q','c','i','l','r'};
        int i;

        System.out.print("исходный массив ");
        for(char ch:a)System.out.print(ch+"  ");

        Quicksort.qsort(a);

        System.out.print("\nотсортерованный массив ");
        for (char ch:a)System.out.print(ch+"  ");

    }
}
