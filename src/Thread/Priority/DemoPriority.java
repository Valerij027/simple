package Thread.Priority;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class DemoPriority {
    public static void main(String args[]){
        System.out.println("Запуск основного потока");
        Priority pr1=new Priority("Child-1");
        Priority pr2=new Priority("Child-2");

        pr1.thread.setPriority(Thread.NORM_PRIORITY+2);
        pr2.thread.setPriority(Thread.NORM_PRIORITY-2);

        pr1.thread.start();
        pr2.thread.start();

        try {
            pr1.thread.join();
            pr2.thread.join();
        }catch(InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println("High Priority "+pr1.count);
        System.out.println("Low Priority "+pr2.count);
    }
}
