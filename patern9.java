import java.util.*;
public class patern9 {
    public static void main(String args[]){
        
        int n=0,x=1;
        Scanner sc=new Scanner(System.in);
for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
  
      if((i+j)%2==0){
        System.out.print(x+" ");
    }
    else{
    System.out.print((n)+" ");
    }
}
    
    System.out.println();
}
     
    }
}
