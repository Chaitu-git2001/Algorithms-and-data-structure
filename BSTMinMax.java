// Class representing a node in BST
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTMinMax {

    TreeNode root;

    // Method to insert a new node into BST
    public TreeNode insert(TreeNode node, int key) {
        if (node == null)
            return new TreeNode(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);

        return node;
    }

    // Method to find the minimum value in BST
    public int findMin(TreeNode node) {
        if (node == null) {
            throw new RuntimeException("BST is empty");
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    // Method to find the maximum value in BST
    public int findMax(TreeNode node) {
        if (node == null) {
            throw new RuntimeException("BST is empty");
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String[] args) {
        BSTMinMax bst = new BSTMinMax();

        // Creating BST from Q10
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for (int key : keys) {
            bst.root = bst.insert(bst.root, key);
        }

        System.out.println("Minimum value in BST: " + bst.findMin(bst.root));
        System.out.println("Maximum value in BST: " + bst.findMax(bst.root));
    }
}
