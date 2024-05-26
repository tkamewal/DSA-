import java.util.*;
public class q5 {
    public static void vote(int age) {
        if(age>=18 &&age>0){
            System.out.println("able to vote");
        }
        else if(age<18&&age>0){
            System.out.println("you are not able to vote tilll 18");
        }
        else{
            System.out.println("no invalid(negative) age please");
        }
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age to check validity to vote...");
    int ag=sc.nextInt();
    vote(ag);
     
    }
}
