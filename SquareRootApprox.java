public class SquareRootApprox {

    // Function to find integer square root
    static int squareRoot(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            // If mid*mid == x → perfect square
            if (mid * mid == x)
                return mid;

            // If mid*mid < x → move right
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;  // store closest so far
            } else {
                // If mid*mid > x → move left
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x1 = 16;
        int x2 = 27;

        System.out.println("Input: " + x1 + " → Output: " + squareRoot(x1));
        System.out.println("Input: " + x2 + " → Output: " + squareRoot(x2));
    }
}
