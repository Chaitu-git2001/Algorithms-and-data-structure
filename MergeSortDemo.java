import java.util.*;

class MergeSortDemo{

    static void merge(int arr[], int l, int m, int r) {
        // Create temp arrays using copyOfRange
        int L[] = Arrays.copyOfRange(arr, l, m + 1);
        int R[] = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0;
        int k = l;

        // Merge two arrays
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Array sorted in Ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
