package Thread.Synchronized;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class MyThread implements Runnable {
    Thread thread;
    static SumArray sa=new SumArray();
    int answer;
    int a[];
    MyThread(String name,int array[]){
        thread=new Thread(this,name);
        a=array;
        thread.start();
    }

    public void run(){


        System.out.println("Запуск "+thread.getName()+" потока");
        answer=sa.sumArray(a);
        System.out.println("Cумма для "+thread.getName()+" потока = "+answer+"\nЗавершение - "+thread.getName());
    }
}
