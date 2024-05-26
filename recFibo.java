import java.util.*;
public class recFibo {

    public static void fib(int a,int b,int n) {
      if(n==0){
        return;
      }
      
        int c=a+b; 
        System.out.print(c+" ");
       fib(b, c, n-1);
        
    }

    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
   int a=0;
   int b=1;
   System.out.print(a+" ");
   System.out.print(b+" "); 
  int n=13;
   fib(a, b, n-2);
   
     
    }
}
