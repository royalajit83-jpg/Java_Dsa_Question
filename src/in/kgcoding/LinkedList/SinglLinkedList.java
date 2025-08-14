package in.kgcoding.LinkedList;

public class SinglLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addAtBeginning(int data){
        Node new_node = new Node(data);
        if (head==null){
            head = new_node;
        }else {
            new_node.next=head;
            head = new_node;
        }
    }

    public void addAtLast(int data){
        Node new_node = new Node(data);
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void addAtPosition(int position,int data){
        Node new_node = new Node(data);
        Node temp = head;
        for (int i = 0; i < (position-1); i++) {
            temp = temp.next;
        }
         new_node.next = temp.next;
         temp.next = new_node;
    }

    public void print(){
        Node temp = head;
        while (temp!=null){
            if (head==null){
                System.out.println("No linked List found");
            }else {
                while (temp!=null){
                    System.out.println(temp.data + " ");
                    temp=temp.next;
                }
            }

        }
    }

    public void deleteAtBeginning(){
        if (head==null){
            System.out.println("no ll is found to delete");
        }else {
           head=head.next;
        }
    }

    public void deleteATLast(){
        Node temp = head;
        Node ptr = temp.next;
        while (ptr.next!=null){
           temp = ptr;
           ptr=ptr.next;
        }

        temp.next = null;
    }

    public void deleteAtPosition(int position){
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i < (position-2); i++) {
            temp = ptr; // 100
            ptr=ptr.next;//300
        }

        temp.next = ptr.next;

    }
    public static void main(String[] args) {
     SinglLinkedList list = new SinglLinkedList();
     list.addAtBeginning(1);
     list.addAtLast(2);
     list.addAtLast(3);
     list.addAtLast(4);
        list.addAtLast(5);
        list.deleteAtPosition(3);
     list.print();
    }
}
