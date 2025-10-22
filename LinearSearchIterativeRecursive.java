public class LinearSearchIterativeRecursive {

    
    static int linearSearchIterative(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    
    static int linearSearchRecursive(int[] arr, int index, int key) {
        // Base case: reached end
        if (index == arr.length) {
            return -1;
        }
        // If element found
        if (arr[index] == key) {
            return index;
        }
        // Recurse for next index
        return linearSearchRecursive(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int searchElement = 30;

        // Iterative Search
        int resultIter = linearSearchIterative(arr1, searchElement);
        if (resultIter != -1) {
            System.out.println("Iterative: Element found at index " + resultIter);
        } else {
            System.out.println("Iterative: Element not found");
        }

        // Recursive Search
        int resultRec = linearSearchRecursive(arr1, 0, searchElement);
        if (resultRec != -1) {
            System.out.println("Recursive: Element found at index " + resultRec);
        } else {
            System.out.println("Recursive: Element not found");
        }
    }
}
