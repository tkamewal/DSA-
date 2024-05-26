import java.util.*;
public class q10 {
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number till than you want to see fibonacci series..");
    int n=sc.nextInt();
    int m1=0;
    int m2=1;
    int sum=0;
    for(int i=1;i<=n;i++){
    System.out.print(sum+" ");
    m1=m2;
    m2=sum;
    sum=m1+m2;
    
    }
     
    }
}
