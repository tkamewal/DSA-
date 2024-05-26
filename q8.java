import java.util.*;
public class q8 {

    public static void power(int a,int b) {
        long num=1;
        while(b!=0){

            num*=a;
            --b;
        }
        System.out.println("the value of power function is: "+num);
    }
        public static void main(String args[]){
         
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numer:");
        int n=sc.nextInt();
          System.out.println("enter the numer for the exponent value:");
        int x=sc.nextInt();
power(n, x);    
    }

}
