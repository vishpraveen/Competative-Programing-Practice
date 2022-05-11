package tree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKSmallestNode {
    
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

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(6);

        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);

        root1.left.left.left = new TreeNode(1);

        int result = findKSmallestNode(root1, 3);
        System.out.println("result: "+ result);
    }

    public static int findKSmallestNode(TreeNode root, int k) {
       PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
           
       });
       findSmallest(root, k-1, queue);

       return queue.poll();
    }

    public static void findSmallest(TreeNode root, int k, PriorityQueue<Integer> queue) {
        if(root == null) return;

        findSmallest(root.left, k, queue);
        findSmallest(root.right, k, queue);

        System.out.print("size: "+queue.size() + "->");
        if(queue.size()-1 < k) {
            queue.add(root.val);
        } else {
            if(root.val < queue.peek()) {
                queue.poll();
                queue.add(root.val);
            }
        }
    }
}
