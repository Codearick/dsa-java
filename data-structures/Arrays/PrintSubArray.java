public class PrintSubArray {
    public static void printSubArray(int [] nums){
        int ts = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print( nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray: " + ts);
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        printSubArray(numbers);
    }
}
