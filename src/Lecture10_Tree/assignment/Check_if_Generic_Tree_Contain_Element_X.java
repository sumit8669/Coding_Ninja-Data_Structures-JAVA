package Lecture10_Tree.assignment;

import Lecture10_Tree.TreeNode;
import Lecture10_Tree.TreeUse;

import java.util.Scanner;

public class Check_if_Generic_Tree_Contain_Element_X extends TreeUse {
    //LoGIC PART
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root == null) return false;

        if(root.data == x) return true;
        for(TreeNode<Integer> child : root.children){
            boolean  ans = checkIfContainsX(child , x);
            if(ans) return true;

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root =  takeInputLevelWise();
        int x = s.nextInt();
        System.out.println(checkIfContainsX(root, x));

    }


}
