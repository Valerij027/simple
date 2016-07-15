package Queue;

/**
 * Created by АбельянцX on 01.07.2016.
 */
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int size){
        this.size=size;
    }
    public String toString(){
        return "\nОчередь заполнена. Максимальный размер очереди "+size;
    }
}
