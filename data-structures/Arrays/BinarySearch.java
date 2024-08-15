public class BinarySearch {
    public static int binarySearch(int [] nums, int key){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons
            if(nums[mid] == key){ //found
                return mid;
            }

            if(nums[mid] < key){ //right
                start = mid + 1; 
            } else{
                end = mid - 1;
            }

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14};
        int key = 14;

        System.out.println("The index of key is: " +binarySearch(numbers, key));
    }
}
