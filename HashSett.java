import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    
    public static void main(String args[]){

        // Creating
        HashSet<Integer> set = new HashSet<>();
     
       // Insert
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);
     System.out.println(set);


     // Search -- contains

     if (set.contains(5)) {
        System.out.println("contains");
     } else{
        System.out.println("not conntainn");
     }

     // delete

     set.remove(1);
     System.out.println(set);

   // Iterator

     Iterator IT = set.iterator();
    //  IT.next();
     while (IT.hasNext()) {
        System.out.print(IT.next()+"->");
     }

     //
System.out.println();
    System.out.println(set.size());
    }
}
