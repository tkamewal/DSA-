public class detectCycle{
 Node head; 


    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
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
public boolean hasCycle(Node head){
    if (head==null) {
        return  false;
    }
    Node hare=head;
    Node turtle=head;
    
    while(hare!=null && hare.next!=null){
        hare=hare.next.next;
        turtle=turtle.next;

        if(hare == turtle){
            return true;
        }
    }
    return false;
}

}