import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapBooksInteractiveRec {

    public static void main(String[] args) {
        HashMap<Integer, String> books = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter commands (ADD, UPDATE, REMOVE, DISPLAY, EXIT):");
        processCommands(books, sc);

        sc.close();
    }

    // Recursive function to process commands interactively
    static void processCommands(HashMap<Integer, String> map, Scanner sc) {
        String command = sc.nextLine().trim();
        if (command.equalsIgnoreCase("EXIT")) return; // base case to stop

        String[] parts = command.split(" ", 3); // max 3 parts

        switch (parts[0].toUpperCase()) {
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
                TreeMap<Integer, String> sorted = new TreeMap<>(map);
                System.out.println(sorted);
                break;

            default:
                System.out.println("Invalid command!");
        }

        // Recursive call for the next command
        processCommands(map, sc);
    }
}
