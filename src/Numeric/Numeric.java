package Numeric;

/**
 * Created by АбельянцX on 30.06.2016.
 */
class Numeric<T extends Number> {
    T o;

    Numeric(T ob){
        o=ob;
    }

    double reciprocal(){
        return 1/o.doubleValue();
    }
    double fraction(){
        return o.doubleValue()-o.intValue();
    }

    boolean absEqual(Numeric<?> a){
        if(Math.abs(o.doubleValue())==Math.abs(a.o.doubleValue()))return true;
        return false;
    }
}
class DemoNuneric{
    public static void main(String args[]){
        Numeric<Integer> iOb=new Numeric<Integer>(98);
        Numeric<Double>dOb=new Numeric<Double>(3.54);

        double s =dOb.reciprocal();
        System.out.println(s);

        double z=iOb.fraction();
        System.out.println(z);

        if(iOb.absEqual(dOb)){
            System.out.println("Идентичны");
        }else System.out.println("Не идентичны");
    }

}

