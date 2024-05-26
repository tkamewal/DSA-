public class TilingRec {


   public static int placeTiles(int n, int m) {
       if(n < m) {
           return 1;
       } else if(n == m) {
           return 2;
       } 
// vertically placements
int verticallyPlacements=placeTiles(n-m, m);

//horizontally placements
int horizontallyPlacements=placeTiles(n-1,m);
int TotalPlacements=verticallyPlacements+horizontallyPlacements;
       return TotalPlacements;
   }


   public static void main(String args[]) {
       int n = 4, m = 2;
       System.out.println(placeTiles(n, m));
   }

}
