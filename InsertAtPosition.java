import java.util.LinkedList;

public class InsertAtPosition {

    // Method to print LinkedList in arrow format
    static void printLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Existing LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Existing LinkedList: ");
        printLinkedList(list);  // 10 -> 20 -> 30 -> 40

        // Node to insert and position
        int newNode = 25;
        int position = 2; // index starts from 0

        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position!");
        } else {
            list.add(position, newNode); // insert at given index
        }

        System.out.print("LinkedList after insertion: ");
        printLinkedList(list);  // 10 -> 20 -> 25 -> 30 -> 40
    }
}
