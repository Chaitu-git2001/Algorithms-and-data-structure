public class IntegerPalindromeSimpleRec {

    // Recursive function to reverse a number
    static int reverse(int num, int rev) {
        if (num == 0) return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }

    // Check palindrome
    static boolean isPalindrome(int num) {
        if (num < 0) return false; // negatives not palindrome
        return num == reverse(num, 0);
    }

    public static void main(String[] args) {
        int n1 = 121;
        int n2 = -121;
        int n3 = 12321;
        int n4 = 123;

        System.out.println("Input: " + n1 + " → Output: " + isPalindrome(n1));
        System.out.println("Input: " + n2 + " → Output: " + isPalindrome(n2));
        System.out.println("Input: " + n3 + " → Output: " + isPalindrome(n3));
        System.out.println("Input: " + n4 + " → Output: " + isPalindrome(n4));
    }
}
