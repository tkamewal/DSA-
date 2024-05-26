
/*
0-> .
1->abc
2->def
3->ghi
4->jkl
5->mno
6->pqrs
7->tu
8->vwx
9->yz
 */

import java.util.*;
public class KeypadCombination {
public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

public static void printComb(String str,int ind,String combination) {

    if(ind==str.length()){
        System.out.println(combination);
        return;
    }
    char currChar=str.charAt(ind);
    String mapping=keypad[currChar-'0'];

    for(int i=0;i<mapping.length();i++){
        printComb(str, ind+1, combination+mapping.charAt(i));
    }
    
}
    
    public static void main(String args[]){
     
    Scanner sc=new Scanner(System.in);
    System.out.println();
    printComb("57", 0, "");
     
    }
}
