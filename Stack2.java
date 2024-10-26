import java.util.*;
public class Stack2 {

    public static void pushbottom(Stack<Integer>s,int data){
        Stack<Integer>s1=new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        if(s.isEmpty()){
            s.push(data);
        }

        while(!s1.isEmpty()){
            s.push(s1.pop());
        }

    }

    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushbottom(s, 5);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();

        }



    }
    
}
