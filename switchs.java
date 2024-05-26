import java.util.*;
public class switchs {
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println("press the number from 1 to 3 to check grettings... ");
    int num=sc.nextInt();
     switch (num) {
        case 1:
            System.out.println("Hello");        
            break;
        case 2:
        System.out.println("namaste");
        break;
        case 3:
        System.out.println("Bonjour");
        break;
        default:
        System.out.println("No greetings for you as you enter wrong number...");
            break;
     }
    }
}
