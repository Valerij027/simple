package Thread.TickTock;

/**
 * Created by АбельянцX on 29.06.2016.
 */
public class MyThread implements Runnable {
    Thread thread;
    TickTock tickTock;

    MyThread (String name,TickTock ob){
        thread=new Thread(this,name);
        thread.start();
        tickTock=ob;
    }
    public void run(){
        if(thread.getName().compareTo("Tick")==0){
            for(int i=0;i<5;i++) {

                tickTock.Tick(true);
            }

            tickTock.Tick(false);
        }
        else {
            for (int i = 0; i < 5; i++) {
                tickTock.Tock(true);
            }

            tickTock.Tock(false);
        }
    }
}
