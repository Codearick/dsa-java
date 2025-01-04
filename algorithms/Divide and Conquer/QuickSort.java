public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // Partition of the array
        int pIdx = partition(arr, si, ei);

        // Recursive calls to sort the left and right partitions
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right
    }

    //Partition method
    public static int partition(int[] arr, int si, int ei) {
        int mid = si + (ei - si) / 2;
        int pivot = arr[mid];

        // Move the pivot to the start of the array for simplicity
        swap(arr, mid, si);

        int i = si;
        int j = ei;

        while (i < j) {

            while (i <= ei && arr[i] <= pivot) {
                i++;
            }

            while (j >= si && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                // Swap
                swap(arr, i, j);
            }
        }

        //Place the pivot in correct position
        swap(arr, si, j);

        return j; // Return the partition index
    }


    // Helper method to swap two elements in the array
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
