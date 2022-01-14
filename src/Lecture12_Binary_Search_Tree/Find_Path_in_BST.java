package Lecture12_Binary_Search_Tree;

import Lecture11_Binary_Trees.BinaryTreeNode;

import java.util.ArrayList;

public class Find_Path_in_BST {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root == null) return null;
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(data);
            return output;
        }
        ArrayList<Integer> leftRoot = getPath(root.left ,data);
        if (leftRoot != null){
            leftRoot.add(root.data);
            return leftRoot;
        }
        ArrayList<Integer> rightRoot = getPath(root.left ,data);
        if (rightRoot != null){
            rightRoot.add(root.data);
            return rightRoot;
        }else return null;
    }
}
