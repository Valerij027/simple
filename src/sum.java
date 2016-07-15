
public class sum {
    static void sum(int ... v){
        int summs=0;
        for(int i=0;i<v.length;i++){
           summs+=v[i];

        }
        System.out.print(summs);
    }
public static void main(String args[]){
 sum.sum(2,3,4,5,5);
}
}


