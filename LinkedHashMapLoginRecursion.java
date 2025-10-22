import java.util.LinkedHashMap;

public class LinkedHashMapLoginRecursion {

    public static void main(String[] args) {
        LinkedHashMap<String, String> logins = new LinkedHashMap<>();

        // Testcase 1: Add, update, display
        String[] commands1 = {"ADD alice a1", "ADD bob b1", "UPDATE alice a2", "DISPLAY"};
        System.out.println("Testcase 1:");
        processCommands(logins, commands1, 0);

        // Testcase 2: Remove, re-add
        logins.clear();
        String[] commands2 = {"ADD alice a1", "ADD bob b1", "ADD carol c1", "REMOVE bob", "ADD bob b2", "DISPLAY"};
        System.out.println("\nTestcase 2:");
        processCommands(logins, commands2, 0);
    }

    // Recursive function to process commands
    static void processCommands(LinkedHashMap<String, String> map, String[] commands, int index) {
        if (index >= commands.length) return; // base case

        String[] parts = commands[index].split(" ", 3);

        switch (parts[0].toUpperCase()) {
            case "ADD":
                map.put(parts[1], parts[2]);
                System.out.println(true);
                break;

            case "UPDATE":
                if (map.containsKey(parts[1])) {
                    map.put(parts[1], parts[2]);
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                break;

            case "REMOVE":
                System.out.println(map.remove(parts[1]) != null);
                break;

            case "DISPLAY":
                System.out.println(map);
                break;

            default:
                System.out.println("Invalid command!");
        }

        // Recursive call for next command
        processCommands(map, commands, index + 1);
    }
}
