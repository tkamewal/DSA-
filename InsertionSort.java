import java.util.*;
public class InsertionSort {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
  int arr[]={7,8,3,1,2};

  for(int i=0;i<arr.length;i++){
    int sortedPart=arr[i];
    int j=i-1;
    while(j>=0 &&  sortedPart<arr[j]) {
   arr[j+1]=arr[j];
   j--;
    }
      arr[j+1]=sortedPart;  
    }
    for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]+" ");
    }
}
     
    }

