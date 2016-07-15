package Thread.Thread;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class ExtendsThread extends Thread {

    ExtendsThread (String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println("Запуск "+getName()+ " потока");
        for (int i=0;i<10;i++){
           try {
               Thread.sleep(400);
           }catch (InterruptedException exc){
               System.out.println(exc.getMessage());
           }
            System.out.println();
            System.out.println(getName()+"  "+i+"\n");
        }
        System.out.println(getName()+ " поток закончен");
    }
}
