import java.util.Scanner;

class StringSorting {
    
    static void sort(String arr[]) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(String arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(String arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String L[] = new String[n1];
        String R[] = new String[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the temp arrays back
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String arr[] = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        sort(arr);

        System.out.println("Strings in Lexicographic Order:");
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
