package Queue;

/**
 * Created by АбельянцX on 01.07.2016.
 */
public class QueueEmptyException extends Exception {
    public String toString(){
        return "\nОчередь пуста.";
    }
}
