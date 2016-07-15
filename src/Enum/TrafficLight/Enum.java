package Enum.TrafficLight;

/**
 * Created by АбельянцX on 29.06.2016.
 */
enum TrafficLightColor{
    RED(5000),GREEN(2000),YELLOW_GO(2000),YELLOW_STOP(5000);
    private int time;
    TrafficLightColor(int time){
     this.time=time;
    }
    int getDelay(){
        return time;
    }
}

class TrafficLightColorSimulator implements Runnable{
    private Thread thread;
    private TrafficLightColor tColor;
    boolean stop=false;
    boolean changed=false;

     TrafficLightColorSimulator(TrafficLightColor color){
         tColor=color;
         thread=new Thread(this);
         thread.start();
     }
    TrafficLightColorSimulator(){
        tColor=TrafficLightColor.RED;
        thread=new Thread(this);
        thread.start();
    }
    public void run(){
        while (!stop){
            try{
                Thread.sleep(tColor.getDelay());
            }catch (InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }
    synchronized void changeColor(){
        switch (tColor){
            case RED:
                tColor=TrafficLightColor.YELLOW_GO;
                break;
            case YELLOW_GO:
                tColor=TrafficLightColor.GREEN;
                break;
            case GREEN:
                tColor=TrafficLightColor.YELLOW_STOP;
                break;
            case YELLOW_STOP:
                tColor=TrafficLightColor.RED;
                break;
        }
        changed=true;
        notify();
    }
    synchronized void waitForChange(){
        try {
            while (!changed)
                wait();
                changed=false;

        }catch (InterruptedException exc){
            System.out.println(exc.getMessage());
        }
    }
    TrafficLightColor getColor(){
        return tColor;
    }
    void cancel(){
        stop=true;
    }

}
