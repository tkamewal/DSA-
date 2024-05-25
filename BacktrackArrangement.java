public class BacktrackArrangement{
 public static void printPermu(String str,String permu,int ind) {
   if(str.length()==0){
    System.out.println(permu);
    return;
   }
   
    for (int i = 0; i < str.length(); i++){
       char currChar=str.charAt(i);
String newStr=str.substring(0, i) + str.substring(i+1);
printPermu(newStr, permu+currChar, ind+1);
    }

 }

    public static void main(String args[]){
       
        String str="ABC";
        printPermu(str, "", 0);
     System.out.println();
    }
 
}