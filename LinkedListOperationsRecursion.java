cimport java.util.*;

public class LinkedListOperationsRecursion {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Commands for Testcase 1
        String[] commands1 = {"ADD A", "ADD B", "ADD C", "REMOVE 0", "DISPLAY"};
        System.out.println("Testcase 1:");
        processCommands(list, commands1, 0); // recursion starts at index 0

        // Commands for Testcase 2
        list.clear();
        String[] commands2 = {"ADD A", "ADD B", "ADD C", "UPDATE 1 X", "DISPLAY"};
        System.out.println("\nTestcase 2:");
        processCommands(list, commands2, 0); // recursion
    }

    // Recursive function to process commands
    static void processCommands(LinkedList<String> list, String[] commands, int index) {
        if (index >= commands.length) return; // base case

        String[] parts = commands[index].split(" ");

        switch (parts[0]) {
            case "ADD":
                list.add(parts[1]);
                break;

            case "REMOVE":
                int indexToRemove = Integer.valueOf(parts[1]);
                if (idxRemove >= 0 && idxRemove < list.size()) list.remove(idxRemove);
                break;

            case "UPDATE":
                int idxUpdate = Integer.valueOf(parts[1]);
                if (idxUpdate >= 0 && idxUpdate < list.size()) list.set(idxUpdate, parts[2]);
                break;

            case "DISPLAY":
                System.out.println(list);
                break;
        }

        // Recursive call for next command
        processCommands(list, commands, index + 1);
    }
}
