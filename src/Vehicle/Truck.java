package Vehicle;

/**
 * Created by АбельянцX on 24.06.2016.
 */
public class Truck extends Vehicle {
    private int cargocap;


    Truck(int p,int f,int m,int c){
        super (p, f, m);
        cargocap=c;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}
