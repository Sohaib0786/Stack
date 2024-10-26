import java.util.*;
public class Ques_toStack {

    //implementation of the stack by using two queue


    static class Stack{
        static Queue<Integer>q1=new LinkedList<>();  //creation of queue 1 from the the scratch
        static Queue<Integer>q2=new LinkedList<>();   //creation of queue 2 from the scratch



        //function to check whether both the queues are empty or not
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();


        }


        //function to push  the element
        
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public static int pop()  {
            if(isEmpty()) {
                System.out.println("our stack is empty");
                return -1;
            }
              int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{  //case2
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }

            }
            return top;

        }

        public static int peek(){
            if(isEmpty()) {
                System.out.println("our stack is empty");
                return -1;
            }
              int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
            
                    q2.add(top);
                }
            }else{  //case2
                while(!q2.isEmpty()){
                    top=q2.remove();
                
                    q1.add(top);
                }

            }
            return top;

        }
   

    }



    public static void main(String args[]){

        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
