import java.util.LinkedHashMap;

public class LinkedHashMapLogin {
    public static void main(String[] args) {
        LinkedHashMap<String, String> logins = new LinkedHashMap<>();

        // Testcase 1: Add, update, display
        System.out.println("Testcase 1:");
        System.out.println(processCommand(logins, "ADD alice a1")); // true
        System.out.println(processCommand(logins, "ADD bob b1"));   // true
        System.out.println(processCommand(logins, "UPDATE alice a2")); // true
        processCommand(logins, "DISPLAY"); // {alice=a2, bob=b1}

        // Clear for next testcase
        logins.clear();

        // Testcase 2: Remove, re-add
        System.out.println("\nTestcase 2:");
        System.out.println(processCommand(logins, "ADD alice a1")); // true
        System.out.println(processCommand(logins, "ADD bob b1"));   // true
        System.out.println(processCommand(logins, "ADD carol c1")); // true
        System.out.println(processCommand(logins, "REMOVE bob"));   // true
        System.out.println(processCommand(logins, "ADD bob b2"));   // true
        processCommand(logins, "DISPLAY"); // {alice=a1, carol=c1, bob=b2}
    }

    static boolean processCommand(LinkedHashMap<String, String> map, String command) {
        String[] parts = command.split(" ", 3);

        switch (parts[0].toUpperCase()) {
            case "ADD":
                map.put(parts[1], parts[2]);
                return true;

            case "UPDATE":
                if (map.containsKey(parts[1])) {
                    map.put(parts[1], parts[2]);
                    return true;
                }
                return false;

            case "REMOVE":
                return map.remove(parts[1]) != null;

            case "DISPLAY":
                System.out.println(map);
                return true;

            default:
                System.out.println("Invalid command!");
                return false;
        }
    }
}
