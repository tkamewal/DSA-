import java.util.*;
public class reverse_linkedlist_iterate {
     Node head; 
    // private int size;
// reverse_linkedlist(){
//     // this.size=0;
// }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
//    size++;
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


    public void reverse_iterate(){

if(head==null){
    return;
}
if(head.next==null){
    return;
}


        Node prevNode=head;
        Node currNode=head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
  head.next=null;
  head=prevNode;


    }



    public static void main(String args[]){
     reverse_linkedlist_iterate list=new reverse_linkedlist_iterate();
list.addFirst(12);
list.addFirst(13);
list.addFirst(14);
list.addFirst(15);
        list.PrintList();
        list.reverse_iterate();
        list.PrintList();
        System.out.println();
    }
}
