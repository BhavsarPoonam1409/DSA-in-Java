public class Bubblesort_practice {
    public static void bubbleSort(int arr[], int size) {

        // Passes
        for (int i = 0; i < size - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < size - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {100,99,98,97,96};

        // Find array size
        int size = arr.length;

        // Call bubble sort
        bubbleSort(arr, size);

        // Print sorted array
        for (int i = 0; i < size; i++) {
            // System.out.println("Element " + (i + 1) + " : " + arr[i]);
            System.out.println(arr[i]);
        }
    }
}

