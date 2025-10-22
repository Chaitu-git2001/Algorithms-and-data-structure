public class SecondLargestElement{

    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return -1;
        }

        // Initialize largest and secondLargest using first two elements
        int largest, secondLargest;
        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        // Iterate through the rest of the array
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // update second largest
                largest = arr[i];        // update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];  // update second largest
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int result = findSecondLargest(arr);
        System.out.println("Second Largest Element: " + result); // 40
    }
}
