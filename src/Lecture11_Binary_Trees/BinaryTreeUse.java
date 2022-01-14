package Lecture11_Binary_Trees;




import Lecture10_Tree.QueueEmptyException;
import Lecture10_Tree.QueueUsingLL;

import java.util.Scanner;

public class BinaryTreeUse {

    public static int countNodes(BinaryTreeNode<Integer> root){

        if (root == null) return 0;
        int ans  = 1;
        ans += countNodes(root.left);
        ans +=countNodes(root.right);
        return ans;

    }

    public static void printBT(BinaryTreeNode<Integer> root){
        if (root == null ) return;

        StringBuilder toBePrinted = new StringBuilder(root.data + ":");
        if (root.left != null){
            toBePrinted.append("L:").append(root.left.data).append(",");
        }
        if (root.right != null){
            toBePrinted.append("R:").append(root.right.data).append(",");
        }
        System.out.println(toBePrinted);
        printBT(root.left);
        printBT(root.right);
    }

    public static  BinaryTreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
        Scanner s = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        int rootData = s.nextInt();
        if (rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.dequeue();
            System.out.println("Enter left child of "+front.data);
            int leftChild = s.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child  = new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }
            System.out.println("Enter right child of "+front.data);
            int rightChild = s.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child  = new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }

        }
        return root;
    }

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.println("Enter root data");
        rootData =s.nextInt();
        if(rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left =takeInput(s);
        root.right = takeInput(s);
        return root;

    }

    public static void main(String[] args) throws QueueEmptyException {
        int[] ascii = { 65, 66, 67, 68};
        String s = new String(ascii, 1, 3);
        System.out.println(s);

    }
}
