public class RepeatedCharacters {
    public static void main(String[] args) {
        String s1 = "programming";
        String s2 = "hello";

        System.out.print("Input: " + s1 + " → Output: ");
        findRepeated(s1);

        System.out.print("Input: " + s2 + " → Output: ");
        findRepeated(s2);
    }

    static void findRepeated(String str) {
        System.out.print("[");
        boolean first = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if already printed
            if (str.indexOf(c) != i) continue;

            // Check if it appears again
            if (str.indexOf(c, i + 1) != -1) {
                if (!first) System.out.print(", ");
                System.out.print("'" + c + "'");
                first = false;
            }
        }

        System.out.println("]");
    }
}
