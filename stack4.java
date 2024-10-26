import java.util.*;
public class stack4 {

    public static void main(String args[]){
       int num=32145;
       Stack<Integer>s=new Stack<>();

       while(num>=0){

        int r=num%10;
        s.push(r);
        num=num/10;

       }

       while(!s.isEmpty()){
        System.out.println(s.peek()+" ");
        s.pop();
       }
        

    }
    
}
