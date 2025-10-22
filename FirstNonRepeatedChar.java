public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s1 = "stress";
        String s2 = "aabbcc";

        System.out.println("Input: " + s1 + " → Output: " + firstNonRepeated(s1));
        System.out.println("Input: " + s2 + " → Output: " + firstNonRepeated(s2));
    }

    static Character firstNonRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            
            if (str.indexOf(c) == str.lastIndexOf(c)) {//comfusing line
                return c;
            }
        }
        return null;
    }
}
