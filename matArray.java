import java.util.*;
public class matArray {

    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println();
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int arr[][]=new int[rows][cols];
    System.out.println("enter the element of the matrix with "+rows+" rows and "+cols+" columns");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("entered matrix is: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("Enter the elemnt you want to found");
    int elm=sc.nextInt();
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        if(arr[i][j]==elm){
            System.out.println("element found at index ("+i+","+j+")");
        }
    }
}
    }
}
