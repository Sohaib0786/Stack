import java.util.*;
public class Queue_jcf {
    //IMPLEMENTATION OF QUEUE BY USING JAVA COLLECTION FRAMEWORK

    public static void main(String args[]){
        //QUEUE Q=NEW QUEUE();

       // Queue<Integer>q=new LinkedList<>();
        Queue<Integer>q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
