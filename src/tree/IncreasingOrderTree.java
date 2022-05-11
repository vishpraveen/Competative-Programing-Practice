package tree;

import java.util.Iterator;
import java.util.Stack;

public class IncreasingOrderTree {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void storeTree(TreeNode root, Stack<Integer> stack) {
        if(root == null) return;

        storeTree(root.left, stack);
        stack.add(root.val);
        storeTree(root.right, stack);
    }

    public static TreeNode insertNode(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
            return root;
        }

        if(val < root.val) root.left = insertNode(root.left, val);

        if(val > root.val) root.right = insertNode(root.right, val);

        return root;
    }

    public static void printTree(TreeNode root) {
        if(root == null) return;

        printTree(root.left);
        System.out.print(root.val);
        printTree(root.right);
    } 

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();

        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(6);

        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);

        root1.left.left.left = new TreeNode(1);

        storeTree(root1, stack);

        Iterator<Integer> i = stack.iterator();

        TreeNode root2 = null;

        while(i.hasNext()) {
            root2 = insertNode(root2, i.next());
        }

        printTree(root2);
    }
}
