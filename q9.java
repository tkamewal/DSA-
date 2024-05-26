import java.util.*;
public class q9 {
 static int gcd(int m, int n) {
    if (n == 0) {
        return m;
    } else {
        return gcd(n, m%n);
     }    }    
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int n1=sc.nextInt();
    System.out.println("Enter second number: ");
    int n2=sc.nextInt();
     System.out.println("the GCD of both numbers "+n1+" and "+n2+" is: "+gcd(n1, n2));
    }
}
