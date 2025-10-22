import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    // Method to print LinkedList in arrow format
    static void printLinkedList(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testcase 1
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.print("Existing LinkedList: ");
        printLinkedList(list1);  // 10 -> 20 -> 30 -> 40

        // Reverse
        Collections.reverse(list1);

        System.out.print("Reversed LinkedList: ");
        printLinkedList(list1);  // 40 -> 30 -> 20 -> 10

        // Testcase 2: Empty LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();

        System.out.print("Existing LinkedList: ");
        printLinkedList(list2);  // (empty)

        Collections.reverse(list2);

        System.out.print("Reversed LinkedList: ");
        printLinkedList(list2);  // (empty)
    }
}
