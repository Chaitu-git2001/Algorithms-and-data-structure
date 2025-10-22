import java.util.TreeSet;

public class TreeSetEmployee {
    public static void main(String[] args) {
        TreeSet<String> employees = new TreeSet<>();

        // Testcase 1: Basic insert, display, delete
        System.out.println("Testcase 1:");
        processCommand(employees, "INSERT Zara");
        processCommand(employees, "INSERT Aman");
        processCommand(employees, "INSERT Neha");
        processCommand(employees, "DISPLAY"); // [Aman, Neha, Zara]
        processCommand(employees, "DELETE Neha");
        processCommand(employees, "DISPLAY"); // [Aman, Zara]

        // Clear for next testcase
        employees.clear();

        // Testcase 2: Duplicates ignored & case sensitivity
        System.out.println("\nTestcase 2:");
        processCommand(employees, "INSERT Meera");
        processCommand(employees, "INSERT meera");
        processCommand(employees, "INSERT Arjun");
        processCommand(employees, "INSERT Arjun"); // duplicate ignored
        processCommand(employees, "DISPLAY"); // [Arjun, Meera, meera]
        processCommand(employees, "DELETE Rahul"); // false
        processCommand(employees, "DELETE Meera"); // true
        processCommand(employees, "DISPLAY"); // [Arjun, meera]
    }

    static void processCommand(TreeSet<String> set, String command) {
        String[] parts = command.split(" ");

        switch (parts[0]) {
            case "INSERT":
                set.add(parts[1]);
                break;

            case "DELETE":
                boolean removed = set.remove(parts[1]);
                System.out.println(removed);
                break;

            case "DISPLAY":
                System.out.println(set);
                break;
        }
    }
}
