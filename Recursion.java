import java.util.*;
public class Recursion {
    
    public static void PrintNumber(int n) {
      if(n==0)
      return;
        System.out.println(n);
        PrintNumber(n-1);
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
System.out.print("Enter a number till you want printing...");
int num=sc.nextInt();
System.out.println("Printing numbers from "+num+" to 1");
PrintNumber(num);
    }
}
