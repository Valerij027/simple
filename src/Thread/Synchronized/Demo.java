package Thread.Synchronized;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class Demo {
    public static void main(String args[]) {
        int q[]=new int[10];
        String str;
        int w,i=0;
        do {
            try {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                str = buf.readLine();
                if(str.compareTo("stop")==0)break;
                w=Integer.parseInt(str);
                q[i]=w;
                i++;
            } catch (Exception exc) {
                str="stop";
                System.out.println("Неверный формат");
            }
        }while ((i<10)&&(str.compareTo("stop")!=0));

        System.out.println("Слагаемые");
        for(int j=0;j<10;j++){
            System.out.print(q[j]+"  ");
        }
        System.out.println();

        MyThread m1=new MyThread("m1",q);
        MyThread m2=new MyThread("m2",q);

    }
}
