import java.util.*;
public class assign1 {

  /*
     REVERSING THE FIRST K ELEMENTS OF A QUEUE
     
     we have an integer k and a queue of integers, we need to reverse the order of first k elements
     of the queue,leaving the other elements in the same relative order. 
    
    
   
   */

    public static void firsthalf(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();

        Queue<Integer>q1=new LinkedList<>();
        Queue<Integer>q2=new LinkedList<>();


        int size=q.size();
          for(int i=0;i<size;i++){

            q1.add(q.remove());

            }

            while(!q1.isEmpty()){
              s.push(q1.remove());
            }

            while(!s.isEmpty()){
              q1.add(s.pop());
            }

            
             while(!q1.isEmpty()){
              q.add(q1.remove());
             }

             for(int i=0;i<size/2;i++) {
              q2.add(q.remove());

             }

             while(!q2.isEmpty()){
              s.push(q2.remove());
             }

             while (!s.isEmpty()) {

              q2.add(s.pop());
              
             }

             while(!q2.isEmpty()){
              q.add(q2.remove());
             }
              





  }

  public static void main(String args[]){
    Queue<Integer>q=new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    q.add(70);
    q.add(80);
    q.add(90);
    q.add(100);
    firsthalf(q);

    while(!q.isEmpty()){
        System.out.print(q.peek()+" ");
        q.remove();
    }



  
   
  
 
 
   









    }
    
}
