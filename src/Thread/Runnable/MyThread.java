package Thread.Runnable;


public class MyThread implements Runnable {
    String threadName;
    Thread thread;

    MyThread(String name){
        thread=new Thread(this,name);
        thread.start();
    }

    public void run(){
        System.out.println("Запуск "+thread.getName()+" потока");


            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(400);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
                System.out.println();
                System.out.println(thread.getName()+"   "+i);
            }
        System.out.println("Завершение "+thread.getName()+" потока");
    }

}
