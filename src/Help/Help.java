package Help;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class Help {
    String fileName;
    int ch;
    String topic,info;

    Help(String str){
        fileName=str;
    }

    boolean helpon(String s){
        int ch;
        try(BufferedReader buf=new BufferedReader(new FileReader(fileName))){
            do{
                ch=buf.read();
                if(ch=='#'){
                    topic=buf.readLine();
                    if(s.compareTo(topic)==0){
                        do{
                            info=buf.readLine();
                            System.out.println(info);
                        }while ((info!=null)&&(info.compareTo("")!=0));
                        return  true;
                    }
                }
            }while (ch!=-1);
        }catch (IOException e){
            System.out.print(e);
        }
        return false;
    }
    String what(){
        String temp="";
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Укажите тему");
        try{
            temp=buf.readLine();
        }catch (Exception e){
            System.out.print(e);
        }
        return temp;
    }

}
