package Thread.Synchronized;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class SumArray {
    private int sum;

    synchronized int sumArray(int a[]){
        sum=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
            System.out.println("Текущее значение суммы для "+Thread.currentThread().getName()+"  "+sum);
            try{
                Thread.sleep(10);
            }catch (InterruptedException exc){
                System.out.println(exc);
            }
        }
        return sum;
    }
}
