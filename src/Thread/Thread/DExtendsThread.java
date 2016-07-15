package Thread.Thread;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class DExtendsThread {
    public static void main(String args[]){
        System.out.println("Начало первого потока");
        ExtendsThread ex=new ExtendsThread("Second");
        ExtendsThread ext=new ExtendsThread("Third");

        do{
            try{
                Thread.sleep(100);
                System.out.print(".");

            }catch(InterruptedException exc){
                System.out.println(exc);
            }
        }while (ex.isAlive()||
                ext.isAlive());
        System.out.println("\nКонец первого потока");
    }
}
