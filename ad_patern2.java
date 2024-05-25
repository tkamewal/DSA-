import java.util.*;
public class ad_patern2 {
    
    public static void main(String args[]){
     int n=5;
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=n;i++){
       for(int k=1;k<=n-i;k++){
        System.out.print(" ");
       } 
        
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
     
    }
}