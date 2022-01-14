package Lecture11_Binary_Trees.assignment;

import Lecture11_Binary_Trees.BinaryTreeNode;

public class Check_Balanced {
    public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
        return heightBT(root) != -1 ;
    }
    public static int heightBT(BinaryTreeNode<Integer> root){
        if (root == null) return  0 ;

        int leftHeight =heightBT(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = heightBT(root.right);
        if (rightHeight == -1) return  -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return  -1 ;
        return 1+Math.max(leftHeight ,rightHeight);
    }

}
