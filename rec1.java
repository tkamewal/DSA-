import java.util.*;
public class rec1 {

    public static void recSum(int i,int n, int sum) {
if(i==n+1){
    // sum+=i;
    System.out.println(sum);
    return;
}
        sum+=i;
        recSum(i+1, n, sum);
        
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println();
     recSum(1, 5, 0);
    }
}
