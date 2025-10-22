public class InsertionSortExample {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 11, 13, 5, 6};
        int[] arr2 = {4, 3, 2, 10, 12};

        insertionSort(arr1);
        insertionSort(arr2);

        System.out.print("Output 1: ");
        printArray(arr1);

        System.out.print("Output 2: ");
        printArray(arr2);
    }
}
