// by this program our stack height become logn and it reduce memory use
import java.util.*;
public class recPow1 {

    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return power(x, n/2) *power(x, n/2);
        }
        else{
            return power(x, (n/2)) * power(x, (n/2)) *x;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
 System.out.println(power(10, 4)); 

    }
}

