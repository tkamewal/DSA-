import java.util.HashSet;
public class SubsequenceUnique {

  public static void Subsequences(String str,int ind,String newString,HashSet<String> set) {
    
    if(ind==str.length()){
      if(set.contains(newString)) {
        return;
      } else {
        System.out.println(newString);
        set.add(newString);
        return;
      }
    }
char currChar=str.charAt(ind);

//to be
Subsequences(str, ind+1, newString+currChar,set);

//or not to be
Subsequences(str, ind+1, newString,set);
  }  

    public static void main(String args[]){
     
    // Scanner sc=new Scanner(System.in);
    System.out.println();
    String str="aaa";
    HashSet<String> set = new HashSet<>();
    Subsequences(str, 0, "",set);
    }
}

