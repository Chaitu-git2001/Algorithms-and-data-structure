public class SquareRootRecursion {

    // Recursive helper function
    static int squareRootHelper(int x, int start, int end) {
        // Base case: no more range
        if (start > end)
            return end;  // end will be floor of sqrt(x)

        int mid = (start + end) / 2;

        // Perfect square
        if (mid * mid == x)
            return mid;

        // If mid*mid < x → answer in right half
        if (mid * mid < x)
            return squareRootHelper(x, mid + 1, end);

        // Otherwise, answer in left half
        return squareRootHelper(x, start, mid - 1);
    }

    // Wrapper function
    static int squareRoot(int x) {
        if (x == 0 || x == 1)
            return x;
        return squareRootHelper(x, 1, x);
    }

    // Driver code
    public static void main(String[] args) {
        int x1 = 16;
        int x2 = 27;

        System.out.println("Input: " + x1 + " → Output: " + squareRoot(x1));
        System.out.println("Input: " + x2 + " → Output: " + squareRoot(x2));
    }
}
