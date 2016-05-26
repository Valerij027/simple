


public class Finalize {
    public static void main(String args[]) {
        int count;

        for (count = 1; count<1000000;count++){
            FDemo ob =new FDemo(count);
        }
    }
}
class FDemo{
    int x;
    FDemo(int i){
        x=i;
    }
    protected void finalize(){
        System.out.println("Финализ  " + x);
    }
    void generate(int i){
        FDemo o=new FDemo(i);
    }
}