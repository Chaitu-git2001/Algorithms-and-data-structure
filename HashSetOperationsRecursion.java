import java.util.HashSet;

public class HashSetOperationsRecursion {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Testcase 1: Add duplicates ignored
        String[] commands1 = {"ADD A", "ADD A", "ADD B", "DISPLAY"};
        System.out.println("Testcase 1:");
        processCommands(set, commands1, 0);

        // Testcase 2: Search present vs absent
        set.clear();
        String[] commands2 = {"ADD A", "ADD B", "SEARCH A", "SEARCH C"};
        System.out.println("\nTestcase 2:");
        processCommands(set, commands2, 0);
    }

    // Recursive function to process commands
    static void processCommands(HashSet<String> set, String[] commands, int index) {
        if (index >= commands.length) return; // base case

        String[] parts = commands[index].split(" ");

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

        // Recursive call for next command
        processCommands(set, commands, index + 1);
    }
}
