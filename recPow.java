import java.util.*;
public class recPow {

    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int new1=power(x, n-1);
       int new2= x *new1 ;
       return new2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
 System.out.println(power(10, 4)); 

    }
}
