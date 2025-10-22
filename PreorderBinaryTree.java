// Class representing a node in the binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class PreorderBinaryTree {

    TreeNode root;

    // Preorder traversal: Root -> Left -> Right
    public void preorder(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        // Create the binary tree as per test case
        PreorderBinaryTree tree = new PreorderBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
    }
}
