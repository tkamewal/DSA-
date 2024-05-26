import java.util.*;
public class if_else {
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age ");
    int age=sc.nextInt();    
    if(age>18 && age>0){
        System.out.println("You are able to vote...");
    }
    else if(age<18 && age>0){
        System.out.println("You are not able to vote...s");
    }
    else{
        System.out.println("Not a age please enter valid age...");
    }
}
}
