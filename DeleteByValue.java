import java.util.LinkedList;

public class DeleteByValue {

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

        // Node to delete
        int nodeToDelete = 30;

        // remove(Object) deletes the first occurrence of the value
        boolean removed = list.remove((Integer) nodeToDelete);

        if (removed) {
            System.out.println("Node " + nodeToDelete + " deleted.");
        } else {
            System.out.println("Node " + nodeToDelete + " not found.");
        }

        System.out.print("LinkedList after deletion: ");
        printLinkedList(list);  // 10 -> 20 -> 40
    }
}
