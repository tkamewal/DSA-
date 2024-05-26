import java.util.*;
public class ReverseString {

    public static void Rev(String n,int ind) {
      if(ind==0-1){
        return;
      }
      
        System.out.print(n.charAt(ind));
        Rev(n, ind-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter a string to reverse...");
     String str=sc.nextLine();
     
Rev(str, str.length()-1);

    }
}
