package EnterConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by АбельянцX on 27.06.2016.
 */
public class EnterStr {
    public static void main(String args[]) throws IOException {
        String srr[] = new String[4];
        String s = "";
        int i = 0;
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите массив строк");

            try {
                do {
                    s = buf.readLine();
                    srr[i] = s;
                    i++;
                } while (!s.equals("stop")&&i<srr.length);

                for (int j = 0; j < srr.length; j++) {
                    System.out.print(srr[j] + "  ");
                }
            } catch (Exception e) {
                System.out.print(e);
            }
            System.out.print("    " + srr.length);

        }
    }
}