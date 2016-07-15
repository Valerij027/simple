package FailSoftArray;

/**
 * Created by АбельянцX on 21.06.2016.
 */
public class FSDemo {
    public static void main(String args[]){
        FailSoftArray ob=new FailSoftArray(6,-1);
        int x;

        for(int i=0;i<(ob.length*2);i++)
            ob.put(i,i*10);

        for(int i=0;i<(ob.length*2);i++){
            x=ob.get(i);

        if(x!=-1)System.out.print(x+"   ");
        }

    }

}
