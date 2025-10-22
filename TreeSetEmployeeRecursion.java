import java.util.TreeSet;

public class TreeSetEmployeeRecursion {

    public static void main(String[] args) {
        TreeSet<String> employees = new TreeSet<>();

        // Testcase 1: Basic insert, display, delete
        String[] commands1 = {"INSERT Zara", "INSERT Aman", "INSERT Neha", "DISPLAY", "DELETE Neha", "DISPLAY"};
        System.out.println("Testcase 1:");
        processCommands(employees, commands1, 0);

        // Testcase 2: Duplicates ignored & case sensitivity
        employees.clear();
        String[] commands2 = {"INSERT Meera", "INSERT meera", "INSERT Arjun", "INSERT Arjun", "DISPLAY",
                              "DELETE Rahul", "DELETE Meera", "DISPLAY"};
        System.out.println("\nTestcase 2:");
        processCommands(employees, commands2, 0);
    }

    // Recursive function to process commands
    static void processCommands(TreeSet<String> set, String[] commands, int index) {
        if (index >= commands.length) return; // base case

        String[] parts = commands[index].split(" ");

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

        // Recursive call for next command
        processCommands(set, commands, index + 1);
    }
}
