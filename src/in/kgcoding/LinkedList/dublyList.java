package in.kgcoding.LinkedList;

public class dublyList {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addAtBeginning(int data){
        Node new_node = new Node(data);
        if (head==null){
            head = new_node;
            tail = new_node;
        }else {
            new_node.next = head;
            head.prev = head;
            head = new_node;

        }
    }

    public void addAtLast(int data){
        Node new_node = new Node(data);
        if (head == null && tail == null){
            System.out.println("no List ");
        }else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    public void addAtPosition(int position,int data){
        Node new_node = new Node(data);
        Node temp = head;
        Node ptr = temp.next;

        for (int i = 0; i < position-1; i++) {
         new_node.prev = temp;
         new_node.next = ptr;
         temp.next=new_node;
         ptr.prev = new_node;

        }
    }

    public void deleteAtBeginning(){
        if (head == null){
            System.out.println("no list found");
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtLast(){
        Node temp = tail.prev;

        temp.next = null;
        tail = temp;
    }


    public void DeleteAtPosition(int position){
        Node temp = head;
        Node ptr = temp.next;

        for (int i = 0; i < (position-1); i++) {
            temp = ptr;
            ptr = ptr.next;
        }
          temp.next = ptr.next;
          ptr.next.prev =temp;
          

    }
    public void Print(){
        Node temp = head;
        if (head == null){
            System.out.println("NO, list found");
        }else {
          do {
              System.out.print(temp.data+" ");
              temp=temp.next;

          }while (temp!=null);
        }
    }
    public static void main(String[] args) {
        dublyList list = new dublyList();
        list.addAtBeginning(1);
        for (int i = 0; i < 10; i++) {
            list.addAtLast(i);
        }
        list.DeleteAtPosition(3);

        list.Print();
    }
}
