package Lecture12_Binary_Search_Tree;

import Lecture11_Binary_Trees.BinaryTreeNode;

public class Check_if_a_Binary_Tree_is_BST {
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private static boolean isValidBST(BinaryTreeNode<Integer> root, long minValue, long maxValue) {
        if (root == null) return true;
        if (root.data >= maxValue || root.data <=minValue) return false;
        return isValidBST(root.left , minValue ,root.data) &&
                isValidBST(root.right , root.data , maxValue);
    }
}
