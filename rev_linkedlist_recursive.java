import java.util.*;
public class rev_linkedlist_recursive {
     Node head; 
    private int size;
rev_linkedlist_recursive(){
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


 public Node reverseRecursive(Node head){
if(head==null || head.next==null){
    return head;
}
     Node newHead=reverseRecursive(head.next);
     head.next.next=head;
     head.next=null;
return newHead;
 }



    public static void main(String args[]){
     rev_linkedlist_recursive list=new rev_linkedlist_recursive();
list.addFirst(12);
list.addFirst(13);
list.addFirst(14);
list.addFirst(15);
        list.PrintList();
    list.head=list.reverseRecursive(list.head);
        list.PrintList();
        System.out.println();
    }
}
