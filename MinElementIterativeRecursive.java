public class MinElementIterativeRecursive {
    
    // Iterative method
    static int findMinIterative(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Recursive method
    static int findMinRecursive(int[] arr, int index) {
        // Base case: if only one element left
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursive call: find min in rest of array
        int minRest = findMinRecursive(arr, index + 1);

        // Compare current with min of remaining
        if (arr[index] < minRest) {
            return arr[index];
        } else {
            return minRest;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 8, 22, 5, 19};
        int[] arr2 = {-4, -15, -7, -2, -30};

        // Testcase 1
        System.out.println("Iterative Min (arr1): " + findMinIterative(arr1)); // 5
        System.out.println("Recursive Min (arr1): " + findMinRecursive(arr1, 0)); // 5

        // Testcase 2
        System.out.println("Iterative Min (arr2): " + findMinIterative(arr2)); // -30
        System.out.println("Recursive Min (arr2): " + findMinRecursive(arr2, 0)); // -30
    }
}
