public class FirstNonRepeatedRecursion {

    // Recursive function to find first non-repeated character
    static Character findFirstUnique(String str, int index) {
        if (index >= str.length()) {
            return null; // base case: no unique char
        }

        char c = str.charAt(index);

        // if first and last index of char are same → unique
        if (str.indexOf(c) == str.lastIndexOf(c)) {
            return c;
        }

        // recursive call for next character
        return findFirstUnique(str, index + 1);
    }

    public static void main(String[] args) {
        String s1 = "stress";
        String s2 = "aabbcc";

        System.out.println("Input: " + s1 + " → Output: " + findFirstUnique(s1, 0));
        System.out.println("Input: " + s2 + " → Output: " + findFirstUnique(s2, 0));
    }
}
