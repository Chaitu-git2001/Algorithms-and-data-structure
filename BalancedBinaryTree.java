// Class representing a node in the binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BalancedBinaryTree {

    TreeNode root;

    // Helper class to store height and balance status
    static class TreeInfo {
        int height;
        boolean isBalanced;

        TreeInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    // Recursive function to check balance
    public TreeInfo checkBalanced(TreeNode node) {
        if (node == null)
            return new TreeInfo(0, true); // empty tree is balanced

        TreeInfo left = checkBalanced(node.left);
        TreeInfo right = checkBalanced(node.right);

        boolean balanced = left.isBalanced && right.isBalanced
                && Math.abs(left.height - right.height) <= 1;

        int height = Math.max(left.height, right.height) + 1;

        return new TreeInfo(height, balanced);
    }

    // Public method to check balance
    public boolean isBalanced(TreeNode node) {
        return checkBalanced(node).isBalanced;
    }

    public static void main(String[] args) {
        BalancedBinaryTree tree1 = new BalancedBinaryTree();
        // Balanced tree
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);
        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(5);

        BalancedBinaryTree tree2 = new BalancedBinaryTree();
        // Skewed tree (like linked list)
        tree2.root = new TreeNode(1);
        tree2.root.right = new TreeNode(2);
        tree2.root.right.right = new TreeNode(3);
        tree2.root.right.right.right = new TreeNode(4);

        System.out.println("Tree 1 balanced? " + tree1.isBalanced(tree1.root)); // True
        System.out.println("Tree 2 balanced? " + tree2.isBalanced(tree2.root)); // False
    }
}
