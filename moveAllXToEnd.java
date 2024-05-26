import java.util.*;
public class moveAllXToEnd {
    

    public static void shiftX(String str, int ind,int count,String newString) {
        
if(ind==str.length()){
    for(int i=0;i<count;i++){
        newString+='x'; 
    }
   System.out.println(newString);
    return;
}

        char currChar=str.charAt(ind);
        if(currChar == 'x'){
count++;
shiftX(str, ind+1, count, newString);
        }else{
          newString+=currChar; 
          shiftX(str, ind+1, count, newString); 
        }
        
    }
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
String str="axcbvxxsd";
shiftX(str, 0, 0,"");
    System.out.println();
     
    }
}
