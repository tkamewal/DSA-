import java.util.*;
public class UpdateBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the opeation you want to perform, 1 for update value to 1, and 0 for update the value to zero..");
        int oper=sc.nextInt();
     
    int n=25;
    int pos=2;
    int BitMap=1<<pos;

    if(oper==1){
        
        int newNum=BitMap | n;
        System.out.println(newNum);
    }
     else{
        int newBitMap= ~(BitMap);
        int newNum=newBitMap & n;
        System.out.println(newNum);
     }
    }
}
