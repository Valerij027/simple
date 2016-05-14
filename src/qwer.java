
public class qwer {
    public static void main(String args[]){
int q=0;
        for(int i=2;i<=100;i++){
            for(int p=2;p<i;p++){
                if(i%p==0){
                    break;
                }
                else  if(i%p!=0& p==i-1){
                    System.out.println(i);
                    q++;
                }
            }
        }
        System.out.println("всего простых чисел в пределе от 0 до 100 = "+q);
    }
}
