package in.kgcoding.LinkedList;

public class CircularList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail= null;

 public void addAtBeginning(int data){
     Node new_node = new Node(data);
     if (head == null){
         head = new_node;
         tail = new_node;
         new_node.next = head;

     }else {
         new_node.next = head;
         head = new_node;
         tail.next = head;
     }

 }

 public void addAtLast(int data){
     Node new_node = new Node(data);
     tail.next = new_node;
     tail = new_node;
     new_node.next= head;

 }

 public void addAtPosition(int position , int data){
     Node new_node = new Node(data);
     Node temp = head;
     for (int i = 0; i < (position-1); i++) {
         temp = temp.next;
     }

     new_node.next = temp.next;
     temp.next=new_node;


 }

 public void deleteAtBeginning(){
     if (head == null){
         System.out.println("No , list was found");
     }else {
         Node temp = head;
         head = temp.next;
         tail.next = head;
     }
 }

 public void deleteAtLast(){
     Node temp = head;
     Node ptr = temp.next;
     while (ptr.next!=head){
         temp = ptr;
         ptr = ptr.next;
     }
     temp.next = head;
     tail = temp;
 }
public void deleteAtPosition(int position){
    Node temp = head;
    Node ptr = temp.next;
    for (int i = 0; i < (position-2); i++) {
        temp = ptr;
        ptr = ptr.next;
    }
    temp.next = ptr.next;

    if (ptr == tail) {
        tail = temp;
    }

}
   public void print(){
     Node temp = head;
     if (head == null){
         System.out.println("no Linked list was found");
     }else {
      do {
          System.out.print(temp.data + " ");
          temp=temp.next;
      }while (temp!=head);
     }
    }
    public static void main(String[] args) {
      CircularList list = new CircularList();
       list.addAtBeginning(1);
        for (int i = 2; i <= 10; i++) {
            list.addAtLast(i);
        }

        list.deleteAtPosition(3);
        list.deleteAtPosition(9);
        list.deleteAtLast(); 


        list.print();
    }
}
