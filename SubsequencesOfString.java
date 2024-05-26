import java.util.*;
public class SubsequencesOfString {

  public static void Subsequences(String str,int ind,String newString) {
    
    if(ind==str.length()){
System.err.println(newString);
return;
    }
char currChar=str.charAt(ind);

//to be
Subsequences(str, ind+1, newString+currChar);

//or not to be
Subsequences(str, ind+1, newString);
  }  

    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println();
    String str="123";
    Subsequences(str, 0, "");
    }
}
