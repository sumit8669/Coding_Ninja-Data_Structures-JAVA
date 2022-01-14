package Lecture11_Binary_Trees.assignment;

import Lecture11_Binary_Trees.BinaryTreeNode;

public class Remove_Leaf_Nodes {
    public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        if (root == null) return null;

        if (root.left == null && root.right == null) return null;

        root.left = removeAllLeaves(root.left);
        root.right = removeAllLeaves(root.right);
        return  root;
    }
}
