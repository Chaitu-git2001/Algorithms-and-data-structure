import java.util.LinkedList;

public class LinkedListInsertEnd {

    static void printLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" --> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        System.out.print("Existing LinkedList: ");
        printLinkedList(list); // 5 → 10 → 15

        
        int[] newElements = {20, 25};
        for (int num : newElements) {
            list.addLast(num); // insert at the end
        }

        System.out.print("LinkedList after insertion: ");
        printLinkedList(list); // 5 → 10 → 15 → 20 → 25
    }
}
