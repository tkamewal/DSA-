import java.util.*;
public class arr {
    
    public static void main(String args[]){
     int num,ser;
     Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of elements you want to store in an array ");
    num=sc.nextInt();
    int arr[]=new int[num];
    System.out.println("Enter "+num+" elements to the array.");
    for(int i=0;i<num;i++){
        System.out.println("Enter element "+(i+1));
        arr[i]=sc.nextInt();
    }
    System.out.println("Stored elements are...");
    for(int i=0;i<num;i++){
        System.out.println(arr[i]);
    }
    System.out.println("Enter element which index you want to search");
    ser=sc.nextInt();
for(int i=0;i<num;i++){

    if(arr[i]==ser){
        System.out.println("index of element "+ser+" is: "+i );
    }
}
// // if(arr[num]!=ser){
//     System.out.println("element not present in array....");
// }
    }
}
