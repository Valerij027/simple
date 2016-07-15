package Thread.Priority;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class Priority implements Runnable{
    static boolean stop;
    static String currentName;

    long count;
    Thread thread;
    Priority(String name){
        count=0;
        thread=new Thread(this,name);
        currentName=name;
    }

    public void run(){
        System.out.println("Запуск "+thread.getName()+" потока");

        do{
            count++;
            if(currentName.compareTo(thread.getName())!=0){
                currentName=thread.getName();
            }
        }while (stop==false&&count<1000000);
        stop=true;
        System.out.println("Завершение "+thread.getName()+" потока");
    }
}
