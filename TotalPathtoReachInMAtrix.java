// import java.util.*;
public class TotalPathtoReachInMAtrix {

    public static int CountPaths(int i,int j,int n,int m) {
         if(i==n || j==m){
            return 0;
         }
         if(i==n-1 && j==m-1){
            return 1;
         }
        //Move Downwards
        int downPaths=CountPaths(i+1, j, n, m);

        //Move Rightwards
        int rightPaths=CountPaths(i, j+1,n, m);

        return downPaths+rightPaths;
    }

    public static void main(String args[]){
      int n=5,m=5;
     System.out.println( CountPaths(0, 0, n, m)) ;
     
    }
}
