import java.util.*;
public class q4 {
    
    public static void  circle(int r) {
        double pie=3.14;
     double res=2*pie*r;
     System.out.println("The circumference of the circle with radius "+r+" is: "+res);
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of the circle...");
    int n=sc.nextInt();
    circle(n);
     
    }
}
