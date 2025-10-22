public class RepeatedCharsRecursion {

    // Recursive function to find repeated characters
    static void findRepeated(String str, int index) {
        if (index >= str.length()) return;  // base case

        char c = str.charAt(index);

        // Check if this character appears again later
        if (str.indexOf(c, index + 1) != -1) {
            // Print only if not already printed
            if (str.indexOf(c) == index) {
                System.out.print("'" + c + "' ");
            }
        }

        // Recursive call for next character
        findRepeated(str, index + 1);
    }

    public static void main(String[] args) {
        String s1 = "programming";
        String s2 = "hello";

        System.out.print("Input: " + s1 + " → Output: [");
        findRepeated(s1, 0);
        System.out.println("]");

        System.out.print("Input: " + s2 + " → Output: [");
        findRepeated(s2, 0);
        System.out.println("]");
    }
}
