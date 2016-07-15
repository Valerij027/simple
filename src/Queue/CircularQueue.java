package Queue;

/**
 * Created by АбельянцX on 26.06.2016.
 */

public class CircularQueue<T> implements ICharQ<T> {

    private T queue[];
    private int putloc,getloc;

    public CircularQueue(T[] a,int number){
        queue=a;
        putloc=getloc=number;
    }

    public void put(T ob) throws QueueFullException {
        if ((getloc == putloc + 1) | ((getloc == 0) & (putloc == queue.length-1))) {
            queue[putloc] = ob;
            throw new QueueFullException(queue.length);
        }
        queue[putloc] = ob;
        System.out.println(queue[putloc] + "   " + putloc);
        putloc++;
        if (putloc == queue.length) putloc = 0;
    }
    public T get()throws QueueEmptyException{
        if(getloc==queue.length)getloc=0;
       return queue[getloc];
    }


    public void reset(){
        putloc=getloc=0;
    }

    public int getPutloc() {
        return putloc;
    }
    public int getGetloc() {
        return getloc;
    }

    public void setGetloc(int getloc) {
        this.getloc = getloc;
    }
}
