import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    
    public static void main(String args[]){
     ArrayList<Integer> list1=new ArrayList<>();

     //add elements
     list1.add(0);
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
 System.out.println(list1);

 //get element
  System.out.println(list1.get(0));  

  // add element in between
  list1.add(1,234);
  System.out.println(list1); 

  //set element
  list1.set(0,5);
  System.out.println(list1);

  //delete element
  list1.remove(1);
  System.out.println(list1 );

  //Size
  int size=list1.size();
  System.out.println(size);

  //loops
  for(int i=0;i<list1.size();i++){
    System.out.print(list1.get(i)+" ");
  }
  System.out.println();

  //sorting
ArrayList<Integer> list=new ArrayList<>();
list.add(5);
list.add(3);
list.add(7);
list.add(8);
list.add(1);
list.add(3);
list.add(4);
System.out.println(list);

Collections.sort(list);
System.out.println(list);

    }}