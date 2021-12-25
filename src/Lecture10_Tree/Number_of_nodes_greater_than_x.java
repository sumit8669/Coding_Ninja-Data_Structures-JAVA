package Lecture10_Tree;

public class Number_of_nodes_greater_than_x {

    public static int numNodeGreater(TreeNode<Integer> root,int x){
       if (root == null) return 0;
       int ans = 0 ;
        for (int i = 0; i <root.children.size(); i++) {
             ans+= numNodeGreater(root.children.get(i) ,x);
        }
       if (root.data > x) ans++;
        return ans;
    }
}
