import java.util.*;
public class Queueimplement {

    //implementation of queue by using linked list

    static class node{
        int data;
        node next;

        node(int data){   // CONSTRUCTOR TO INITIALISE THE VARIABLES
            this.data=data;
            this.next=null;
        }
    }


    //class queue for the implementation of the queue

    static class Queue{
        static node head=null;
        static node  tail=null;


        //function to check whether our queue is empty or not
    
    public static boolean isEmpty(){
        return head==null && tail==null;
    }

    //function to add the element inside the queue
    public static void add(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;

        }
        tail.next=newnode;
        tail=newnode;
    }
    //function to remove the element from the queue

    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        int front=head.data;
        //single element
        if(tail==head){
            tail=head=null;
        }
        else{
            head=head.next;
        
        }

        return front;



    }
    //peek

    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
    }

    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }


}
}



    

