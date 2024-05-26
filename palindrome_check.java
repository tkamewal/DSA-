import java.util.LinkedList;
public class palindrome_check {
   static  Node head; 
    private int size;
palindrome_check(){
    this.size=0;
}

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
   size++;
        }
    }

    public void addFirst(int data){
    Node newNode=new Node(data);
    if(head == null){
       head =  newNode;
        return;
    }
    newNode.next=head;
    head=newNode;  
}
public void PrintList() {
    if(head==null){
        System.out.println("List is empty...");
        return;
    }
Node CurrNode=head;
while(CurrNode !=null){
    System.out.print(CurrNode.data+" -> ");
    CurrNode=CurrNode.next;
}
System.out.println("NULL");
    
}
public Node reverse(Node head){
    Node prev=null;
    Node curr=head;
    while(curr !=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}

public Node findMiddle(Node head){
    Node hare=head;
    Node turtle=head;

    while(hare.next != null && hare.next.next!= null){
        hare=hare.next.next;
        turtle=turtle.next;
    }
    return turtle;
}

public boolean ispalindrome(Node head){

    if(head==null || head.next==null){
        return true;
    }

    Node middle=findMiddle(head);  // it tells end of first half 
    Node secondHalfStart= reverse(middle.next);

    Node firstHalfStart=head;
    while(secondHalfStart != null){
        if(firstHalfStart != secondHalfStart){
            return false;
        }
        firstHalfStart=firstHalfStart.next;
        secondHalfStart=secondHalfStart.next;
    }
    return true;
}
public static void main(String[] args) {
    palindrome_check plist=new palindrome_check();
    
   plist.addFirst(10);
   plist.addFirst(20);
   plist.addFirst(10);
   plist.PrintList();
   plist.findMiddle(head);
   plist.reverse(head);
   plist.ispalindrome(head);
}
}
