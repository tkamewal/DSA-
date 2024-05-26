import java.util.*;

public class patern4 {
    public static void main(String args[]){
     
        Scanner sc=new Scanner(System.in);
for(int i=1;i<=4;i++){
    for(int j=i;j<=4;j++){
        System.out.print("* ");

    }
    System.out.println();
}
        System.out.println();

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     
    }
}
