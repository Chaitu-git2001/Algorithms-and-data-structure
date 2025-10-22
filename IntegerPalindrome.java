public class IntegerPalindrome {
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;

        System.out.println("Input: " + num1 + " → Output: " + isPalindrome(num1));
        System.out.println("Input: " + num2 + " → Output: " + isPalindrome(num2));
    }

    static boolean isPalindrome(int num) {
        // Negative numbers are not palindrome
        if (num < 0) return false;

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}
