class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    public void preorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        SortedArrayToBST tree = new SortedArrayToBST();
        TreeNode root = tree.sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.print("Preorder Traversal of Balanced BST: ");
        tree.preorder(root);
    }
}
