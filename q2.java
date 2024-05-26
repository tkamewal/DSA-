import java.util.*;
public class q2 {
    public static void func1(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
sum=sum+i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to "+n+" is: "+sum);
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number till you want sum of odd numbers: ");
    int m=sc.nextInt();
    func1(m);
     
    }
}
