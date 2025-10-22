public class CountEvenOddIterativeRecursive {

    // Iterative method
    static void countEvenOddIterative(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    // Recursive method
    static int[] countEvenOddRecursive(int[] arr, int index) {
        // Base case
        if (index == arr.length) {
            return new int[]{0, 0}; // {even, odd}
        }

        int[] counts = countEvenOddRecursive(arr, index + 1);

        if (arr[index] % 2 == 0) {
            counts[0]++; // even count
        } else {
            counts[1]++; // odd count
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};

      
        System.out.print("Iterative Count (arr1): ");
        countEvenOddIterative(arr1); // Even: 3, Odd: 3

        int[] result1 = countEvenOddRecursive(arr1, 0);
        System.out.println("Recursive Count (arr1): Even: " + result1[0] + ", Odd: " + result1[1]);

        
        System.out.print("Iterative Count (arr2): ");
        countEvenOddIterative(arr2); // Even: 4, Odd: 0

        int[] result2 = countEvenOddRecursive(arr2, 0);
        System.out.println("Recursive Count (arr2): Even: " + result2[0] + ", Odd: " + result2[1]);
    }
}
