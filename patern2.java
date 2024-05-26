import java.util.*;
public class patern2 {
        public static void main(String args[]){
         
        Scanner sc=new Scanner(System.in);
        // System.out.print("* * * * *\n*       *\n*       *\n* * * * *");
         
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==2 || i==3 ){
                    
                        if(j==2 || j==3 || j==4){
                           System.out.print("  ");
                            continue;
                        }}
                        System.out.print("* ");
                }

                System.out.println();
            }

System.out.println();

for(int i=1;i<=4;i++){
    for(int j=1;j<=5;j++){
        if(i==1 || j==1 || i==4 || j==5){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
    }
    System.out.println();
}

        }
        }

