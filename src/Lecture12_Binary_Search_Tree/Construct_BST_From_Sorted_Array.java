package Lecture12_Binary_Search_Tree;

import Lecture11_Binary_Trees.BinaryTreeNode;

public class Construct_BST_From_Sorted_Array {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        if(n ==0 ) return null;
        return helperTree( arr, 0 ,n-1);
    }
    public static BinaryTreeNode<Integer> helperTree(int[] arr, int leftSide , int rightSide){
                    if (leftSide > rightSide) return null;
                 int midPoint = leftSide + (rightSide-leftSide)/2;
                 BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[midPoint]);
                 root.left = helperTree(arr , leftSide,midPoint-1);
                 root.right = helperTree(arr , midPoint+1,rightSide);
                 return root;
    }
}

