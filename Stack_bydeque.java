import java.util.*;
public class Stack_bydeque {
     //Stack by using deque
   
    /*

       ->push O(1)        ->add O(1)                     
       ->pop O(1)         ->remove O(1)
       ->peek O(1)        ->peek O(1)
     
     */

     static class Stack{

        Deque<Integer>deque=new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
     }

    public static void main(String args[]){

        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("peek ="+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        

        }



    }



    

