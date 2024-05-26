public class LinkedListsFromScratch {
    Node head; 
    private int size;
LinkedListsFromScratch(){
    this.size=0;
}

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
   size++;
        }
    }
    //Add at first.... 
public void addFirst(String data){
    Node newNode=new Node(data);
    if(head == null){
       head =  newNode;
        return;
    }
    newNode.next=head;
    head=newNode;  
}

//Add last....
public void addLast(String data){
    Node newNode=new Node(data);
    if(head == null){
       head =  newNode;
        return;
    }
Node CurrNode=head;
while(CurrNode.next != null){
    CurrNode=CurrNode.next;
}
CurrNode.next=newNode;
}

//print
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

//Delete first
public void DeleteFirst() {
     if(head==null){
        System.out.println("The list is empty..."); 
        return;
     }
     size--;
     head=head.next;
}

//Delete last
public void DeleteLast() {
      if(head==null){
        System.out.println("The list is empty..."); 
        return;
     }

     size--;
     if(head.next==null){
        head=null;
        return;
     }
     Node secondLast=head;
     Node lastNode=head.next;
  while(lastNode.next != null){
    lastNode=lastNode.next;
    secondLast=secondLast.next;
  }
secondLast.next=null;
    }

    //Size
    public int GetSize(){
        return size;
    }

    public static void main(String args[]){
LinkedListsFromScratch list=new LinkedListsFromScratch();
   list.addFirst("a"); 
   list.addFirst("is"); 
   list.addFirst("Linked"); 
   list.addLast("nothing");
   list.PrintList();
   list.DeleteFirst();
   list.PrintList();
   list.DeleteLast(); 
   list.PrintList();
   System.out.println(list.GetSize());
   
   list.addFirst("my");
   list.PrintList();
   System.out.println(list.GetSize());
   System.out.println();
     
    }
}
