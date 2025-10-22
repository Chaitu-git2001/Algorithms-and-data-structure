public class ReverseArrayIterativeRecursive {
    
    
    static void printReverseIterative(int[] arr) {
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Recursive method
    static void printReverseRecursive(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        if (index == arr.length - 1) {
            System.out.print("[");
        }
        System.out.print(arr[index]);
        if (index > 0) {
            System.out.print(", ");
        } else {
            System.out.println("]");
        }
        printReverseRecursive(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-1, 2, -3, 4, -5};

        // Testcase 1
        System.out.print("Iterative Reverse (arr1): ");
        printReverseIterative(arr1); // [5, 4, 3, 2, 1]

        System.out.print("Recursive Reverse (arr1): ");
        printReverseRecursive(arr1, arr1.length - 1); // [5, 4, 3, 2, 1]

        // Testcase 2
        System.out.print("Iterative Reverse (arr2): ");
        printReverseIterative(arr2); // [-5, 4, -3, 2, -1]

        System.out.print("Recursive Reverse (arr2): ");
        printReverseRecursive(arr2, arr2.length - 1); // [-5, 4, -3, 2, -1]
    }
}
