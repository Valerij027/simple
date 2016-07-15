package Stack;

public class Stack {
    private char stack[];
    private int putloc,getloc;

    Stack(int size){
        stack=new char[size+1];
        putloc=getloc=0;
    }

    Stack(char a[]) {
        putloc = 0;
        getloc = 0;
        stack = new char[a.length + 1];

        for(char i:stack)push(a[i]);
    }
    void push(char ch){
        if(putloc==stack.length-1){
            System.out.print("\nОчередь полная");
            return;
        }
        putloc++;
        stack[getloc]=ch;
        getloc=putloc;
    }

    char pop(){
        if (getloc == 0) {
            System.out.print("\nОчередь пуста");
            return (char) 0;
        }
        getloc--;
        return stack[getloc];
    }
}


