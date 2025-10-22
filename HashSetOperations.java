import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Testcase 1: Add duplicates ignored
        System.out.println("Testcase 1:");
        processCommand(set, "ADD A");
        processCommand(set, "ADD A"); // duplicate
        processCommand(set, "ADD B");
        processCommand(set, "DISPLAY"); // Output: [A, B]

        // Clear set for next testcase
        set.clear();

        // Testcase 2: Search present vs absent
        System.out.println("\nTestcase 2:");
        processCommand(set, "ADD A");
        processCommand(set, "ADD B");
        processCommand(set, "SEARCH A"); // true
        processCommand(set, "SEARCH C"); // false
    }

    static void processCommand(HashSet<String> set, String command) {
        String[] parts = command.split(" ");

        switch (parts[0]) {
            case "ADD":
                set.add(parts[1]);
                break;

            case "REMOVE":
                set.remove(parts[1]);
                break;

            case "SEARCH":
                System.out.println(set.contains(parts[1]));
                break;

            case "DISPLAY":
                System.out.println(set);
                break;
        }
    }
}
