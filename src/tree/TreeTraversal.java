package tree;

import java.util.LinkedList;
import java.util.Queue;



public class TreeTraversal {
    
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

    public static void printInOrder(TreeNode root) {
        if(root == null) return;

        printInOrder(root.left);
        System.out.print(root.val + "->");
        printInOrder(root.right);
    }

    public static void printPreOrder(TreeNode root) {
        if(root == null) return;

        System.out.print(root.val+"-> ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    
    public static void printPostOrder(TreeNode root) {
        if(root == null) return;

        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.val+"-> ");
    }

    public static void printLevelOrder(TreeNode root) {
    
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.val + "-> ");

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(10);

        printInOrder(root);
        System.out.println("");
        printPreOrder(root);
        System.out.println("");
        printPostOrder(root);
        System.out.println("");
        printLevelOrder(root);
    }
    
}
