import java.util.*;
public class GetBit {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
int n=6;
int pos=3;
int bitMap=1<<pos;
int num=bitMap & n;
if(num==0){

    System.out.println("Bit is zero");
}     
else{

    System.out.println("Bit is one");
}
    }
}
