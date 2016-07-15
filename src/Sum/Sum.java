package Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class Sum {
    public static void main(String args[])throws IOException{
        int n;
        String str;
        double sum=0;

        System.out.println("Введите число слагаемых ");
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        try {
            str = buf.readLine();
            n=Integer.parseInt(str);
            System.out.println(n);
        }catch (Exception e){
            System.out.println(e.getMessage());
            n=0;
        }
        System.out.println("Ввод "+n+" значений");
        for(int i=0;i<n;i++){
            str=buf.readLine();
           try {
               sum+=Double.parseDouble(str);
           }catch (NumberFormatException exc){
               System.out.println(exc.getMessage());
           }
            System.out.println(i+1+" : "+Double.parseDouble(str));
        }
        System.out.println("Среднее ="+sum/n);
    }
}
