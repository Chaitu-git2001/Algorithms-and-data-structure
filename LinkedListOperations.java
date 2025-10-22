import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Example Testcase 1
        System.out.println("Testcase 1:");
        processCommand(list, "ADD A");
        processCommand(list, "ADD B");
        processCommand(list, "ADD C");
        processCommand(list, "REMOVE 0");
        processCommand(list, "DISPLAY"); // Expected: [B, C]

        // Clear list for second testcase
        list.clear();

        // Example Testcase 2
        System.out.println("\nTestcase 2:");
        processCommand(list, "ADD A");
        processCommand(list, "ADD B");
        processCommand(list, "ADD C");
        processCommand(list, "UPDATE 1 X");
        processCommand(list, "DISPLAY"); // Expected: [A, X, C]
    }

    static void processCommand(LinkedList<String> list, String command) {
        String[] parts = command.split(" ");

        switch (parts[0]) {
            case "ADD":
                list.add(parts[1]);
                break;

            case "REMOVE":
                int indexToRemove = Integer.valueOf(parts[1]);
                if (indexToRemove >= 0 && indexToRemove < list.size()) {
                    list.remove(indexToRemove);
                }
                break;

            case "UPDATE":
			int indexToUpdate = Integer.valueOf(parts[1]);
                if (indexToUpdate >= 0 && indexToUpdate < list.size()) {
                    list.set(indexToUpdate, parts[2]);
                }
                break;

            case "DISPLAY":
                System.out.println(list);
                break;
        }
    }
}
