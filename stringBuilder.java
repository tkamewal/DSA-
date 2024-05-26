import java.util.*;
public class stringBuilder {
   
   public static void main(String args[]){
    
   Scanner sc=new Scanner(System.in);
  StringBuilder sb=new StringBuilder("tanmay");
  
   System.out.println(sb);
   
   sb.setCharAt(0, 'z');
   System.out.println(sb);
   
sb.insert(0,'t')  ; 
   System.out.println(sb);
   
   sb.delete(0, 2); 
   System.out.println(sb);
   
sb.append("n");   
   System.out.println(sb);


}


}
