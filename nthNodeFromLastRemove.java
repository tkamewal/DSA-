public class nthNodeFromLastRemove {
 ListNode head; 
    private int size;
nthNodeFromLastRemove(){
    this.size=0;
}

    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data=data;
            this.next=null;
   size++;
        }
    }
    //Add at first.... 
public void addFirst(String data){
    ListNode newNode=new ListNode(data);
    if(head == null){
       head =  newNode;
        return;
    }
    newNode.next=head;
    head=newNode;  
}
    public ListNode removeNthFromEnd(ListNode head, int n) {
   if(head.next == null) {
       return null;
   }
  
  
   int size = 0;
   ListNode temp = head;
   while(temp != null) {
       temp = temp.next;
       size++;
   }
  
   //removing SIZEth node from last i.e. head
   if(n == size) {
       return head.next;
   }
  
   //find previous node
   int ptf = size - n; // position to find
   ListNode prev = head; // previous node
   int cp = 1; // current position
  
   while(cp != ptf) {
       prev = prev.next;
       cp++;
   }
  
   prev.next = prev.next.next;
   return head;
}

}