package ArrayAccese;

/**
 * Created by АбельянцX on 26.05.2016.
 */
public class ar {
    private int a[]; //ссылка на масив;
    private int errval;//значение возращающее в случае возникнавения ошибки при выполнении метода get()
    int lenght;

    //конструктор
    public ar(int size, int errv){
        a=new int[size];
        errval=errv;
        lenght=size;
    }

    public int get(int index){
        if(indexOK(index))return a[index];
        return errval;
    }
    public boolean put(int index,int val){
        if(indexOK(index)){
            a[index]=val;
            return true;
        }return false;
    }

    private boolean indexOK(int index){
      if(index>=0&index<lenght)return true;
        return false;
    }

}
