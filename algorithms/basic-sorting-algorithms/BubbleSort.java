class BubbleSort {
    /**
     * Performs Bubble Sort on the given array.
     * The algorithm repeatedly steps through the list, compares adjacent elements,
     * and swaps them if they are in the wrong order.
     * This process is repeated until the list is sorted.
     *
     * @param nums the array of integers to be sorted
     */
    public static void bubbleSort(int[] nums) {
        // Loop over the entire array (except the last element)
        for (int turn = 0; turn < nums.length - 1; turn++) {
            int swap = 0; // Counter to track if any swaps are made in the current pass
            
            // Traverse the array from the beginning up to the last unsorted element
            for (int i = 0; i < nums.length - 1 - turn; i++) {
                // Compare adjacent elements
                if (nums[i] > nums[i + 1]) {
                    // Swap if they are in the wrong order
                    swap++;
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            
            // If no swaps were made, the array is already sorted
            if (swap == 0) {
                break; // Exit early to avoid unnecessary passes
            }
        }
        
        // Print the sorted array
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", "); // Print a comma after each element except the last one
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        // Example array to sort
        int[] nums = { 1, 3, 2, 4, 5, 7, 6 };
        bubbleSort(nums); // Call the bubbleSort method to sort the array
    }
}
