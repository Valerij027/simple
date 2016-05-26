import java.io.IOException;

/**
 * Created by АбельянцX on 16.05.2016.
 */
public class enter {
    public static void main(String args[])throws IOException {
        char ch,ignor;
        int i=0;
        for(;;) {
               ch=(char)System.in.read();
                do {
                    ignor = (char) System.in.read();
                } while (ignor!='\n');
            if(ch==' ') i++;
            if(ch=='.') break;
        }
        System.out.println("\n"+i);
    }
}
