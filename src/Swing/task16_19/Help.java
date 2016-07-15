package Swing.task16_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by АбельянцX on 07.07.2016.
 */
public class Help {

    String str,topic,info,u,i;
    char ch;

    Help(String str){
        this.str =str;
    }

    public String helpOn(String q){

        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\Swing\\task16_19\\Info.TXT"));
            do{
                ch=(char)bufferedReader.read();
                System.out.println(ch);
                if(ch=='#'){
                    topic=bufferedReader.readLine();
                    System.out.println(topic);
                    if(topic.equals(q)){
                        for(;;){
                             i=bufferedReader.readLine();
                             System.out.println(i);
                             if(i.compareTo(".")==0)
                                 break;
                             info+=(i);
                        }
                        break;
                    }
                }
            }while(ch!=-1);
            if(ch==-1)info="not exists";
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        String substring;
        substring=info.substring(4);
        return substring;
    }
}
