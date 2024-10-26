import java.util.*;
public class stack3 {

    public static void main(String args[]){

        int arr[]={10,20,30,40,50};
        Stack<Integer>s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }


        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
    
}
