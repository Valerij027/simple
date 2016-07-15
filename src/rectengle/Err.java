package rectengle;


public class Err {
    String msg;
    int severity;

    Err(String m,int s){
        msg=m;
        severity=s;
    }
}

class ErrInfo{
    String msgs[]={
            "Ошибка вывода",
            "Ошибка ввода"
    };
    int howbad[]={1,2};

    Err getErrorInfo(int i) {
        if(i>=0&i<=msgs.length){
            return new Err(msgs[i],howbad[i]);
        }
        else  return new Err("такой ошибки не существует", 0);
    }
}

class ErrDemo{
    public static void main(String args[]){
        ErrInfo er=new ErrInfo();
        Err e;
        e=er.getErrorInfo(1);
        System.out.println(e.msg+ " - уровень : "+e.severity);
    }
}