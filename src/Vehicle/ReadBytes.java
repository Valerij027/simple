package Vehicle;

import java.io.IOException;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class ReadBytes {
    public static void main(String args[])throws IOException{
        byte date[]=new byte[10];
        System.out.println("Введите символы ");
        try {


            System.in.read(date);
            System.out.println("Вы ввели ");
            for(int i=0;i<=date.length;i++){
                System.out.print((char)date[i]);
            }
        }catch (Exception e){
            System.out.print(e);
        }

    }
}
