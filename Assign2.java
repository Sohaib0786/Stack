import java.util.*;
public class Assign2 {

    /*
       
      connect n ropes with minimum cost
      Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum
       cost, such that the cost to connect two ropes is equal to the sum of their lengths;
      
      
     
     */


    public static int ropes(int arr[]){
    PriorityQueue<Integer>q=new PriorityQueue<>();
    int curr1;
    int curr2;
    int profit=0;
    int sum=0;

    Arrays.sort(arr);

    for(int i=0;i<arr.length;i++){
        q.add(arr[i]);
    }

    while(q.size()>1){
        curr1=q.remove();
        curr2=q.remove();

         sum=sum+curr1+curr2;
    
       // profit=Math.max(profit,sum);

        q.add(curr1+curr2);
           
    }
    return sum;
}


    public static void main(String args[]){
        int arr[]={1,2,3};

        System.out.println(ropes(arr));

    }
    
}
