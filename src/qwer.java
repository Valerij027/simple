import java.io.IOException;

public class qwer {
    public static void main(String args[])throws IOException{
     for(int i=0;i<4;i++){
         System.out.println();
         one:{
         two:{
         three:{
                 System.out.print("i=" + i + "      ");
                 if (i == 1) {
                     break one;
                 }
                 if (i == 2) {
                    continue ;
                 }
                  if(i==3){
                 break ;
                  }
             }System.out.print("i=3");
             }System.out.print("i=2");
             }System.out.print("i=1");

     }
    }
}
