package Help;

/**
 * Created by АбельянцX on 28.06.2016.
 */
public class DHelp {
    public static void main(String args[]){
        String q;
        Help help=new Help("C:\\Users\\АбильянцXD\\IdeaProjects\\simple\\src\\Help\\Info.TXT");
        do{
           q=help.what();
            if (!help.helpon(q))
                System.out.println("Тема не найдена\n");
        }while (q.compareTo("stop")!=0);
        q=help.what();
        boolean v =help.helpon(q);
        System.out.println(q+"   "+v);
    }
}
