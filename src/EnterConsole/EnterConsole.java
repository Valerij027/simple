package EnterConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class EnterConsole {
    public static void main(String args[])throws IOException{
        char c;
        char q[]=new char[10];
       try(BufferedReader buf=new BufferedReader(new InputStreamReader(System.in))){
           System.out.print("Введите символ :");
           do{
               c=(char)buf.read();
               System.out.print(c+" ");
           }while (c!='.');


       }catch (Exception e){
           System.out.println(e.getMessage());
       }



    }
}
