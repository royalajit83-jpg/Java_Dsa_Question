package in.kgcoding.Binary_Search;

public class Binary {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int value){
        if (root==null){
            root = new Node(value);
            return root;
        }

        if (root.data>value){
           root.left =  insert(root.left,value);
        }else{
           root.right =  insert(root.right,value);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static boolean search(Node root,int value){
        if (root == null){
            return false;
        }

        if (root.data > value){
            return search(root.left,value);
        }else if (root.data==value){
            return true;
        }else {
            return search(root.right,value);
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,8,1,5,3,7,4,6};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root,arr[i]);
        }
        inorder(root);
        if (search(root,8)){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }

    }
}
