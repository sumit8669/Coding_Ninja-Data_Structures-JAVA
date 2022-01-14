package Lecture11_Binary_Trees.assignment;

import Lecture11_Binary_Trees.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ZigZag_Tree {
    public static boolean isCousin(BinaryTreeNode<Integer> root, int A, int B) {
        if (root == null) return false;
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isAexist = false;
            boolean isBexist = false;
            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> cur = queue.poll();
                if (cur.data == A) isAexist = true;
                if (cur.data == B) isBexist = true;
                if (cur.left != null && cur.right != null) {
                    if (cur.left.data == A && cur.right.data == B) {
                        return false;
                    }
                    if (cur.left.data == B && cur.right.data == A) {
                        return false;
                    }
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            if (isAexist && isBexist)  return true;
        }
        return false;

    }
}
