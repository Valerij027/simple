package Stack;


public class StackDemo {
    public static void main(String args[]){
        Stack st=new Stack(26);

        for(int i=0;i<26;i++){
            st.push((char)('A'+i));
        }

        for(int i=0;i<26;i++){
            char ch=st.pop();
            System.out.print(ch+"  ");
        }

    }
}
