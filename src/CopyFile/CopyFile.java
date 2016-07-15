package CopyFile;

import java.io.FileInputStream;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class CopyFile {
    public static void main(String args[]){
        char a,b;
        int i=0,j=0;

        try (FileInputStream fin1=new FileInputStream("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\CopyFile\\in1.TXT");
        FileInputStream fin2=new FileInputStream("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\CopyFile\\in2.TXT")){
           do{
               i=fin1.read();
               j=fin2.read();
               if(i!=j){
                   break;
               }

           }while (i!=-1&&j!=-1);

            if(i!=j)
                System.out.println("содержимое не совпадает");
            else System.out.println("содержимое файлов совподает");

        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
