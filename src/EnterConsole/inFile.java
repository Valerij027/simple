package EnterConsole;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class inFile {
    public static void main(String args[]){
        String s;
       try( BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\EnterConsole\\out.TXT"))){
           while ((s=br.readLine())!=null){
               System.out.print(s+"");
           }
       }catch (Exception e){System.out.print(e);}
    }
}
