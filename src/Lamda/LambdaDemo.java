package Lamda;

import java.util.function.Function;

/**
 * Created by АбельянцX on 02.07.2016.
 */
public class LambdaDemo {
    public static void main(String args[]){

        MyValue myValue=()->98.2;
        System.out.println(myValue.getValue());

        MyParamValue myParamValue=(n)->1/n;
        System.out.println(myParamValue.getValue(4));

        Bul bul=(n,m)->n%m==0;
        if(bul.qwer(4,2))System.out.println("делиться");
        else System.out.println("не делиться");

        Bul bul1=(n,m)->Math.abs(n)==Math.abs(m);
        if(bul1.qwer(-2,2))System.out.println("абсолютные значения равны");

        Bul bul2=(n,m)->(n<0? -n:n)==(m<0?-m:m);
        if(bul2.qwer(2,2))System.out.println("абсолютные значения равны");

        NumericFunc numericFunc=(n)->{
            int res=1;

            for(int i=2;i<=n;i++){
                res=i;
                if(n%res==0){
                    break;
                }
            }
            return res;

        };

        System.out.println("Наименьшим делителем 10= "+numericFunc.func(10));

        Double q[]={1.2,1.3,1.4,1.5};

        Sqrt<Double> s=(v)->{
          for (int i=0;i<v.length;i++){
              v[i]=Math.sqrt(v[i]);
          }
            for(int i=0;i<v.length;i++){
                System.out.print(v[i]+"  ");
            }
        };

        s.sqrt(q);
        A a=new A(6);
        comm<Boolean> com=a::isFactor;
        Boolean bul3=com.function(3);
        if(bul3)System.out.println("\nделится");

        VOID v=A::isFactor2;
        v.qwery(2);

        numericFunc=(n) -> {
            long result=1;
            for (int i=1;i<=n;i++){
                result*=i;
            }
            return result;
        };

        System.out.println("Фактариал "+20+" = "+numericFunc.func(20));


        Function<Integer,String> function=(n)-> {
            long result = 1;
            for (int j = 1; j <=n; j++)
                result *= j;
            String str = String.valueOf(result), stringOut = "";
                for (int k = str.length()-1; k >=0; k--) {
                    stringOut+= str.charAt(k);
                    if (((str.length() - k) % 3 == 0) & (k != 0))
                        stringOut += '.';
                }
            String strs1="";
            for (int k = stringOut.length()-1; k >=0; k--){
                strs1+= stringOut.charAt(k);
            }

                return strs1;

        };
        System.out.println("Фактариал "+20+" = "+function.apply(20));

        B b =new B(10);
        InterfaceForB forB=b::isF;

        if(forB.func(20)){
            System.out.println("есть");
        }

        if(Cis.func(b::isF,5))System.out.println("!");




    }
}
