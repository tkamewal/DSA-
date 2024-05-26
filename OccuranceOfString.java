import java.util.*;
public class OccuranceOfString {
    public static int first=-1;
    public static int last=-1;
    public static void Occurance(String str,int ind,char elem) {
       if(ind==str.length()){
// System.out.println(first);
// System.out.println(last);
return;
       }
       
        // char currChar=str.charAt(ind);
        if(str.charAt(ind)==elem){
            if(first==-1){
                first=ind;
            }else{
                last=ind;
            }
        }
        Occurance(str, ind+1, elem);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     
    System.out.println("enter a string....");
    String st=sc.nextLine();
    Occurance(st, 0, 'a');
     
    System.out.println("First occurance: "+first);
 System.out.println("Last occurance : "+last);
    }
}
