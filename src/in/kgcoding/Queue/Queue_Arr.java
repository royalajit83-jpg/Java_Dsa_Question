package in.kgcoding.Queue;

public class Queue_Arr {
   int size = 10;
   int[] arr = new int[size];
   int front = -1;
   int rear = -1;

   public void enqueue(int data){

       if (rear == size-1){
           System.out.println("queue is full ");
       }else{
           if (front == -1 && rear == -1){
               front = 0;
               rear = 0;
           }else{
               rear = rear + 1;
               arr[rear] = data;
           }
       }
   }

   public void dequeue(){
       if (front==-1){
           System.out.println("now queue is empty ");
       }else {
           front = front + 1;
       }
   }

   public void display(){
       if (front == -1 && rear == -1){
           System.out.println("no, data found");
       }else {
           for (int i = front; i <=rear ; i++) {
               System.out.println(arr[i]);
           }
       }
   }
}
