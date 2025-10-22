import java.util.Scanner;

public class BinarySearchTree2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder Traversal
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Create BST from sorted array
    public static Node createBST(int arr[], int st, int end) {
        if (st > end) return null;

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = createBST(arr, 0, n - 1);

        System.out.println("Preorder Traversal of BST:");
        preOrder(root);

        sc.close();
    }
}
