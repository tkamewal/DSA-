import java.util.*;
public class q3 {
    public static void great(int a,int b) {
        if(a>b){
            System.out.println("First is greater than second "+a+">"+b);

        }
        else if(a==b){
            System.out.println("both are equal....");
        }
        else{
                       System.out.println("second is greater than first "+b+">"+a);
 
        }

    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int n=sc.nextInt();
    System.out.println("enter second number");
    int m=sc.nextInt();
    great(n, m);
     
    }
}
