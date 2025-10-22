import java.util.*;

public class HashMapBooks {
    public static void main(String[] args) {
        HashMap<Integer, String> books = new HashMap<>();

        // Testcase 1: Basic add & sorted display
        System.out.println("Testcase 1:");
        processCommand(books, "ADD 205 Refactoring");
        processCommand(books, "ADD 101 Clean_Code");
        processCommand(books, "ADD 150 Effective_Java");
        processCommand(books, "DISPLAY"); // sorted display

        // Clear for next testcase
        books.clear();

        // Testcase 2: Update, remove, verify
        System.out.println("\nTestcase 2:");
        processCommand(books, "ADD 1 Alpha");
        processCommand(books, "ADD 2 Beta");
        processCommand(books, "UPDATE 2 Beta_2nd_Ed");
        processCommand(books, "REMOVE 1");
        processCommand(books, "DISPLAY");
    }

    static void processCommand(HashMap<Integer, String> map, String command) {
        String[] parts = command.split(" ", 3); // split into max 3 parts

        switch (parts[0]) {
            case "ADD":
                int idAdd = Integer.parseInt(parts[1]);
                map.put(idAdd, parts[2]);
                break;

            case "UPDATE":
                int idUpdate = Integer.parseInt(parts[1]);
                if (map.containsKey(idUpdate)) {
                    map.put(idUpdate, parts[2]);
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                break;

            case "REMOVE":
                int idRemove = Integer.parseInt(parts[1]);
                System.out.println(map.remove(idRemove) != null);
                break;

            case "DISPLAY":
                // Display sorted by key
                TreeMap<Integer, String> sorted = new TreeMap<>(map);
                System.out.println(sorted);
                break;
        }
    }
}
