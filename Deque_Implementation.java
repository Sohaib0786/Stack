import java.util.*;
public class Deque_Implementation {

     //dequeue and deque both are different terms 
     //Basically deque means double ended queue
     //ans dequeue is a verb,action and method which is used to remove an element from the queue
    
    /*                                          
     
    -------------------------------
                   |      |     | 
    -------------------------------
        
     */

    public static void main(String args[]){
       Deque<Integer>deque=new LinkedList<>();
         deque.addFirst(1);//1
         deque.addFirst(2);//2 1
         deque.addLast(3);
         deque.addLast(4);
        // deque.removeLast();
         System.out.println(deque);
        // deque.removeFirst();
        // System.out.println(deque);

        System.out.println("first el="+deque.getFirst());
        System.out.println("last el ="+deque.getLast());

   
    }


}
