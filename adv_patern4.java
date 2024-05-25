import java.net.SocketPermission;
import java.util.*;
public class adv_patern4 {
    
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=5;i++){
        for(int k=1;k<=5-i;k++){
            System.out.print("  ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }  
    }
    }

