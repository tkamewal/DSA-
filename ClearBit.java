import java.util.*;
public class ClearBit {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=10;
        int pos=1;
        int BitMap=1<<pos;
        int NewBitMap= ~(BitMap);
        int newNumber= NewBitMap & n;
    System.out.println(newNumber);
     
    }
}
