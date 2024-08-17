public class CountingSort {
    public static void countingSort(int[]nums){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int count [] = new int[largest+1];
        for (int i = 0; i < count.length; i++) {
            count[nums[i]]++;
        } 

        //sorting
        int j = 0;
        for(int i=0; i < count.length; i++){
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i : nums) {
            System.out.print(i +" ");
        }
    }
    public static void main(String[] args){
        int [] nums = {1,4,1,3,2,4,3,7};
        countingSort(nums);
    }
}
