package Lecture10_Tree;

public class Sum_of_Nodes {
    public static int sumOfAllNode(TreeNode<Integer> root){
        if(root == null) return 0;
        int count = 1;
        for(int i = 0; i < root.children.size(); i++){
            count += sumOfAllNode(root.children.get(i));
        }
        return count;
    }
}
