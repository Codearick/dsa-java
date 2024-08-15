public class LargestNum{
    public static int getLargest(int [] nums){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){
        int [] nums = {1,2,6,3,5};

        System.out.println("The largest number is: "+ getLargest(nums));
    }
}
