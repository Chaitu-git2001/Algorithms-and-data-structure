public class AverageArrayIterativeRecursive {
    
    // Iterative method
    static double findAverageIterative(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    // Recursive method to calculate sum
    static int findSumRecursive(int[] arr, int index) {
        // Base case: last element
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Recursive case
        return arr[index] + findSumRecursive(arr, index + 1);
    }

    // Recursive method to calculate average
    static double findAverageRecursive(int[] arr) {
        int sum = findSumRecursive(arr, 0);
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {-5, 10, 15, -10, 5};

        // Testcase 1
        System.out.println("Iterative Average (arr1): " + findAverageIterative(arr1)); // 30.0
        System.out.println("Recursive Average (arr1): " + findAverageRecursive(arr1)); // 30.0

        // Testcase 2
        System.out.println("Iterative Average (arr2): " + findAverageIterative(arr2)); // 3.0
        System.out.println("Recursive Average (arr2): " + findAverageRecursive(arr2)); // 3.0
    }
}
