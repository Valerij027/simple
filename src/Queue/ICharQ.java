package Queue;

/**
 * Created by АбельянцX on 26.06.2016.
 */
public interface ICharQ<T> {
    void put (T ob)throws QueueFullException;
    T get()throws QueueEmptyException;
    void reset();


}
