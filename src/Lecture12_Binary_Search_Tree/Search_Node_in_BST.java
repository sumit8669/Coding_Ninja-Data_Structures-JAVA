package Lecture12_Binary_Search_Tree;

import Lecture11_Binary_Trees.BinaryTreeNode;

public class Search_Node_in_BST {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        //base case
        if(root==null) return false;

        //Recursion
        if(root.data==k) return true;
        else if(k<root.data)
            return searchInBST(root.left,k);
        else
            return searchInBST(root.right,k);

    }
}
