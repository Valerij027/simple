package RandomAccess;

import java.io.RandomAccessFile;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class RandomAccess {
    public static void main(String args[]){
        double array[]={15.6,84.19,53.7,12,43};
        double a;

            try(RandomAccessFile ran=new RandomAccessFile("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\RandomAccess\\out.TXT","rw")){
                for (int i=0; i<array.length;i++){
                   ran.writeDouble(array[i]);
                }

                ran.seek(0);
                a=ran.readDouble();
                System.out.println(a);

                for(int i=0;i<array.length*8;i=i+8){
                    ran.seek(i);
                    a=ran.readDouble();
                    System.out.println(a+"  ");
                }
            }catch (Exception e){
                System.out.println(e);
            }
    }
}
