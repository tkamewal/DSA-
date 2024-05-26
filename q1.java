import java.util.*;
public class q1 {
public static int avg(int a,int b,int c){
    int avgn=(a+b+c)/3;
    return avgn;
}    
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three numbers you want average of...");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
     System.out.println("The average of numbers is : "+avg(m1, m2, m3));
    }
}
