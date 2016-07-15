package Thread.Runnable;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class DThread {
    public static void main(String args[]){

        System.out.println("Запуск основного потока\n");
        System.out.println("Запуск основного потока\n");
        MyThread myThread=new MyThread("Child №1");
        MyThread m=new MyThread("Child №2");


        //MyThread myThread=new MyThread("Child");//Создание  исполняемого объекта
        //Thread newMyThread=new Thread(myThread);//формирование потока для объекта myThread
        //newMyThread.start();//запуск потока на выполнение


        try {
            myThread.thread.join();
            m.thread.join();
        }catch (InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println("\nЗавершение основного потока");
    }
}
