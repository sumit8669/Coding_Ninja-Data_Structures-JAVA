package Lecture10_Tree;

import java.io.IOException;

import static Lecture10_Tree.TreeUse.takeInputLevelWise;

public class Find_Height {
    public static int getHeight(TreeNode<Integer> root){
       if (root == null) return 0;
       if(root.children == null) return 1;
       int height = 0;
        for (TreeNode<Integer> child : root.children)
        {
            height = Math.max(height, getHeight(child));
        }
        return height + 1;
    }

    public static void main(String[] args) throws IOException {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(getHeight(root));

    }
}
