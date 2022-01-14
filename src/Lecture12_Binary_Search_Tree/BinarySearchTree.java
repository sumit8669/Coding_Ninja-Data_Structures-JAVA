package Lecture12_Binary_Search_Tree;

import Lecture11_Binary_Trees.BinaryTreeNode;

public class BinarySearchTree {
 private   BinaryTreeNode<Integer> root;
    public void insert(int data) {

    }

    public void remove(int data) {

    }

    public void printTree() {

    }

    public boolean search(int data) {
        return searchHelper(root,data);
    }
    private boolean searchHelper(BinaryTreeNode<Integer> root,int data){
        if (root == null) return false;

        if (data == root.data) return true;
        else if (data > root.data){
            //call  right
              return   searchHelper(root.right, data);
        }else{
            // call left
            return  searchHelper(root.left, data);
        }
    }

}
