package Thread.TickTock;

/**
 * Created by АбельянцX on 29.06.2016.
 */
public class Demo {
    public static void main(String args[]){
        TickTock tickTock=new TickTock();
        MyThread m1=new MyThread("Tick",tickTock);
        MyThread m2=new MyThread("Tock",tickTock);

        try {
            m1.thread.join();
            m2.thread.join();
        }catch (Exception exc){
            System.out.println("ошибка");
        }
    }
}
