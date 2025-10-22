import java.util.HashSet;

public class DuplicateElementsArray {

    // Method to find duplicates iteratively
    static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num); // duplicate found
            } else {
                seen.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.print("Duplicate elements: ");
            int count = 0;
            for (int num : duplicates) {
                System.out.print(num);
                count++;
                if (count < duplicates.size()) System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 2, 5, 1};
        int[] arr2 = {10, 20, 30, 40, 50};

        // Testcase 1
        findDuplicates(arr1); // Duplicate elements: 1, 2

        // Testcase 2
        findDuplicates(arr2); // No duplicates found
    }
}
