class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTExample {

    TreeNode root;

    public TreeNode insert(TreeNode node, int key) {
        if (node == null) {
            return new TreeNode(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        }

        return node;
    }
    public void inorder(TreeNode node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BSTExample bst = new BSTExample();

        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for (int key : keys) {
            bst.root = bst.insert(bst.root, key);
        }

        System.out.print("BST Inorder Traversal: ");
        bst.inorder(bst.root);
    }
}
