import java.util.*;
public class Queueimplement1 {

    //Queue by using array
    //pop O(n)
    //add O(1)

    static class Queue{
        //properties of class queue
        static int arr[];
        static int size;
        static int rear;


        Queue(int n){  //constructor of class queue
            arr=new int[n];
            size=n;
            rear=-1;
        }
        //to check whether our stack is empty or not 
        public static boolean isEmpty(){
            return rear==-1;
        }

        //Adding the element in the queue

        public static void Add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }

            rear=rear+1;
            arr[rear]=data;
        }

        //removing the element from the queue

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }


    }

    public static void main(String args[]){
        Queue q=new Queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        //1 2 3 4

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }


    
}
