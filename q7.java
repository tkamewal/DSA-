import java.util.*;
public class q7 {
    
    public static void main(String args[]){  
int n;
 int[] value;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number till than you want printing..");
 n=sc.nextInt();
 value=new int[n];
    System.out.println("Enter "+n+" elements.");
     for(int i=0;i<n;i++){
         value[i]=sc.nextInt();
     }
for(int i=0;i<n;i++){
    if(value[i]>0){
        System.out.println("positive "+value[i]);
    }
     if(value[i]<0){
        System.out.println("negative "+value[i]);
     }
     if(value[i]==0){
        System.out.println("zero "+value[i]);
     }
}
     
    }
}
