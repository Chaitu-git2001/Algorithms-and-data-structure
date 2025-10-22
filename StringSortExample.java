public class StringSortExample {

    public static void sortStrings(String[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry", "date"};
        String[] arr2 = {"dog", "cat", "elephant", "bee"};

        sortStrings(arr1);
        sortStrings(arr2);

        System.out.print("Output 1: ");
        printArray(arr1);

        System.out.print("Output 2: ");
        printArray(arr2);
    }
}
