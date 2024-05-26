import java.util.*;
public class PermutationsOfString {
    
    public static void PermuString(String str,String permutation) {

        if(str.length()==0){

            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
             char currChar=str.charAt(i);
             //"abc" -> "ab"    
String newStr=str.substring(0, i)+ str.substring(i+1);
PermuString(newStr, permutation+currChar);
        }
        
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println();
     
    PermuString("abc", "");
    }
}
