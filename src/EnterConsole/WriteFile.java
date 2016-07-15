package EnterConsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class WriteFile {
    public static void main(String args[]){
        String str;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        try(FileWriter fout=new FileWriter("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\EnterConsole\\out.TXT")){
            do {
                str = buf.readLine();
                fout.write(str+" ");
            }while(!str.equals("stop"));
        }catch (Exception e){
            System.out.print(e);
        }
    }
}
