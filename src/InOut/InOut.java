package InOut;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InOut {
    public static void main(String args[]){
        int i=10;
        double b =3.45;
        byte by =13;

    try(DataOutputStream out=new DataOutputStream(new FileOutputStream("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\InOut\\out.TXT"))) {
        System.out.println("запись i= "+i);
        out.writeDouble(b);

        out.writeInt(i);
    }catch (Exception exc){
        System.out.print(exc.getMessage());
    }
        try(DataInputStream in =new DataInputStream(new FileInputStream("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\InOut\\out.TXT"))) {

            b=in.readDouble();
            System.out.println("прочитанно"+b);
            i=in.readInt();
            System.out.println("прочитанно"+i);


        }catch (Exception exc){
            System.out.println(exc);
        }
}}
