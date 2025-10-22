import java.util.LinkedList;

public class InsertAtBeginning {

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

        System.out.print("Existing LinkedList: ");
        printLinkedList(list); // 10 -> 20 -> 30

        // Insert at beginning
        int newNode = 5;
        list.addFirst(newNode);

        System.out.print("LinkedList after insertion: ");
        printLinkedList(list); // 5 -> 10 -> 20 -> 30
    }
}
