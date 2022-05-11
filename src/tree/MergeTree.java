package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTree {
    
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

    private static List<Integer> list = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();

    public static void mergeTrees(TreeNode root1, TreeNode root2) {
        traverseTree(root1, list);
        traverseTree(root2, list2);
        
        // sortLists(list, list2);
    }

    private List<Integer> sortLists(List<Integer> list, List<Integer> list2) {
        List<Integer> mergeList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < list.size() && j < list2.size()) {
            if(list.get(i) < list2.get(j)) {
                mergeList.add(list.get(i));
                i++;
            } else {
                mergeList.add(list2.get(j));
                j++;
            }
        }

        while(i < list.size()) {
            mergeList.add(list.get(i));
            i++;
        }

        while(j < list2.size()) {
            mergeList.add(list2.get(j));
            j++;
        }

        return mergeList;
    } 

    public static void traverseTree(TreeNode root, List<Integer> list) {
        if(root == null) return;

        traverseTree(root.left, list);
        list.add(root.val);
        traverseTree(root.right, list);
    }

    public static void main(String args[]) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        mergeTrees(root1, root2);
    }
}
