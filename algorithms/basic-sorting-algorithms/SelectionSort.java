public class SelectionSort {
    public static void selectionSort(int [] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i; 
            for (int j = i + 1; j < nums.length -1; j++) {
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            //Swapp
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
       for (int i : nums) {
        System.out.println(i);
       }
    }
    public static void main(String[] args) {
        int [] nums = {5,4,1,3,2};
        System.out.println("The sorted array by selection sort is: ");
        selectionSort(nums);
    }
}
