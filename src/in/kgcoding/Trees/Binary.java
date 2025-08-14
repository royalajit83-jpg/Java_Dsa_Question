package in.kgcoding.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Binary {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data= data;
        }
    }

//    public static Node LevelOrder(Node root) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(root.data);
//        while (!q.isEmpty()) {
//            int current = q.remove();
//        }
//
//    }

    static class BinaryTree{
        static int indx = -1;
        public static Node binary(int[] node){
            indx++;
        if (node[indx]==-1){
            return null;
        }
        Node new_node = new Node(node[indx]);
        new_node.left = binary(node);
        new_node.right = binary(node);

        return new_node;
        }
    }

    public static int sumOfNode(Node root){
        if (root == null){
            return 0;
        }
        int left = sumOfNode(root.left);
        int right = sumOfNode(root.right);

        return left+right+root.data;
    }


    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -1, -1, 6, 9, -1, -1, 1, -1, 5, -1, -1};
       Node root = BinaryTree.binary(arr);
       inorder(root);
        System.out.println(sumOfNode(root));
    }
}
