package tree;

import com.sun.istack.internal.NotNull;

import java.util.LinkedList;

public class BinarySearchTree {
    TreeNode root;

    public TreeNode insertNode(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if(key < root.key) {
            root.left = insertNode(root.left, key);
        }
        if(key > root.key) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public boolean searchElement(TreeNode node, int key) {
        if (node == null) return false;
        if (node.key == key) return true;

        if (key < node.key) return searchElement(node.left, key);
        else return searchElement(node.right, key);
    }

    public TreeNode deleteNode(TreeNode node, int key) {
        if(node == null) return null;

        if(key< node.key) node.left = deleteNode(node.left, key);
        else if(key > node.key) node.right = deleteNode(node.right, key);
        else {
            if(node.left == null && node.right == null) {
                return null;
            } else if(node.left != null && node.right ==  null) {
                return node.left;
            } else if(node.left == null && node.right != null) {
                return node.right;
            } else if(node.left != null && node.right != null) {
                int rightMin = getRightMin(node.right);
                node.key = rightMin;
                node.right = deleteNode(node.right, rightMin);
            }
        }
        return node;
    }

    public int minimumValueInTree(TreeNode node) {
        if(node == null) return -1;
        if(node.left == null) return node.key;
        return minimumValueInTree(node.left);
    }

    public int getRightMin(TreeNode node) {
        int min = 0;

        while(node != null) {
            min = node.key;
            node = node.left;
        }
        System.out.println("Min: "+ min);
        return min;
    }

    public void printTreeBFS(TreeNode node) {
        if(node != null) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            printBFS(queue);
        }
    }

    private void printBFS(LinkedList<TreeNode> queue) {
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            System.out.print(node.key+ " ->");
        }
    }

    public TreeNode mirrorTree(TreeNode node) {
        if(node == null) return null;
        node.left = mirrorTree(node.left);
        node.right = mirrorTree(node.right);
        swapTree(node);
        return node;
    }

    private void swapTree(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public void inOrder(TreeNode node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.key + " ->");
        inOrder(node.right);
    }

    public void insertArrayElementsToTree(@NotNull int[] arr) {
        for (int item: arr) {
            root = insertNode(root, item);
        }
    }

    public int sizeOf(TreeNode node) {
        if(node == null) return 0;
        int leftCount = sizeOf(node.left);
        int rightCount = sizeOf(node.right);
        return 1+leftCount+rightCount;
    }

    public static void main(String[] args) {
//        int[] arr = {100, 50, 200, 10, 60, 150, 300, 250};
//        int[] arr = {100, 50 , 200, 10, 60};
        int[] arr = {100, 50 , 200};
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertArrayElementsToTree(arr);

        tree.inOrder(tree.root);

        System.out.println("sizeOf: "+ tree.sizeOf(tree.root));

//        TreeNode mirrorTree = tree.mirrorTree(tree.root);
//        System.out.println("Mirror tree: ");
//        tree.printTreeBFS(mirrorTree);
//        System.out.println("\n");
//        tree.inOrder(tree.root);

//        System.out.println();
//        tree.root = tree.deleteNode(tree.root, 200);
//        tree.inOrder(tree.root);

//        System.out.println("\nisElement present in tree: "+tree.searchElement(tree.root, 60));
//        System.out.println("\nMinimum value present in tree: "+tree.minimumValueInTree(tree.root));
//        System.out.println("Print BFS TREE: ");
//        tree.printTreeBFS(tree.root);
    }
}
