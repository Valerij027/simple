package Thread.TickTock;

/**
 * Created by АбельянцX on 29.06.2016.
 */
public class TickTock {
    String state;

    synchronized void Tick(boolean running) { //если метод отмечен как synchronized, значит объект который его вызывает блокируется, если объект
        if (!running) {                       //блокирован, то он не доступен из другого потока, а кроме того его нельзя вызвать из других synchronized
            state = "ticked";                 //методах, обявленных в классе данного объекта.
            notify();
            return;
        }
        try {
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("Tick");
        state = "ticked";
        notify();//позволяет выполнять метод tock;
        try {
            while (!state.equals("tocked")) {
                wait();//ожидать до завершения метода tock();
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }

    synchronized void Tock(boolean running){
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        try {
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("Tock\n");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked")) {
                wait();//ожидать до завершения метода tock();
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
}


