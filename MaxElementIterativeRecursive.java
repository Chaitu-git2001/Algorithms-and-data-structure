public class MaxElementIterativeRecursive {
    
    static int findMaxIterative(int[] arr) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMaxRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxRest = findMaxRecursive(arr, index + 1);
        if (arr[index] > maxRest) {
            return arr[index];
        } else {
            return maxRest;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 25, 47, 3, 19};
        int[] arr2 = {-5, -10, -3, -20, -7};

        // Testcase 1
        System.out.println("Iterative Max (arr1): " + findMaxIterative(arr1)); // 47
        System.out.println("Recursive Max (arr1): " + findMaxRecursive(arr1, 0)); // 47

        // Testcase 2
        System.out.println("Iterative Max (arr2): " + findMaxIterative(arr2)); // -3
        System.out.println("Recursive Max (arr2): " + findMaxRecursive(arr2, 0)); // -3
    }
}
