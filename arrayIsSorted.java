import java.util.*;
public class arrayIsSorted {
    
public static boolean isSorted(int arr[],int ind) {
    
    if(ind==arr.length-1){
        return true;
    }
    
    if(arr[ind]<arr[ind+1]){ 
        //array is sorrted till now
     return isSorted(arr, ind+1);
    }else{
        return false;
    }
    
}

    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println();
     int arr[]={1,2,2,443,5234};
    System.out.println( isSorted(arr, 0));
    }
}
