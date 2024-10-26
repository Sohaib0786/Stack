import java.util.*;
public class Stack1 {

    public static void reverseStack(Stack<Integer>s){
        Queue<Integer>q=new LinkedList<>(); 
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!q.isEmpty()){
            s.push(q.remove());
        }
            
        
    }


    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();

        }

    }
    
}
