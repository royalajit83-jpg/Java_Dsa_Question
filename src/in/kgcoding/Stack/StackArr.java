package in.kgcoding.Stack;

public class StackArr {
    int top = -1;
    int size = 10;
    int[] arr = new int[size];


    public void push(int data){
        if (top == size-1){
            System.out.println("stcak limit reach");
        }else {
            top = top + 1;
            arr[top]= data;
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("stack is empty");
        }else{
            top = top -1;

        }
    }

    public void display(){
        for (int i = top; i>=0 ; i--) {
            System.out.println(arr[i]);
        }
    }

}
