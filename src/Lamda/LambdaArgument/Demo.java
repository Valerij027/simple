package Lamda.LambdaArgument;

/**
 * Created by АбельянцX on 03.07.2016.
 */
public class Demo {
    public static void main(String args[]) {
        StringFuns stringFuns = (str) -> str;
        System.out.println(stringFuns.func("Java мой любимый язык"));
        String inStr="java-сорт-кофе";


        String revers=LambdaArgument.change((str) ->{
            String result="";

            for(int i=str.length()-1;i>=0;i--)
                result+=str.charAt(i);

            return result;
        },inStr);
        System.out.println(revers);


    StringFuns a=str -> {
        return str.replace('-',' ');
    };
    String w=LambdaArgument.change(a,inStr);
        System.out.println(w);


    StringFuns register=str -> {
        String result="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            }
            result+=ch;
        }
        return result;
    };
        String e=LambdaArgument.change(register,w);
        System.out.println(e);
    }
}
