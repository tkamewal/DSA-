import java.util.HashMap;
import java.util.*;
public class HashMapp {
    
    public static void main(String args[]){

        HashMap<String, Integer> map = new HashMap<>();


     map.put("India", 120);
     map.put("China", 1200);
     map.put("America", 1210);

     System.out.println(map);

     if (map.containsKey("C hina")) {
        System.out.println("has");
     } else {
        System.out.println("not");
     }
       
     System.out.println(map.get("China"));
     System.out.println(map.get("indonesia"));


     int arr[] = {1, 2, 3};
     for(int val : arr) {
        System.out.println(val);
     }

     for(Map.Entry<String, Integer> e : map.entrySet()) {
        System.out.print(e.getKey()+" ");
        System.out.print(e.getValue()+" ");
     }
    }}
      

