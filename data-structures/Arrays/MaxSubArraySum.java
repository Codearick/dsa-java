public class MaxSubArraySum {
    public static void maxSubArraySum(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += nums[k];
                }
                // System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum using brute force: " + maxSum);
    }

    public static void maxSubArraySumUsingPrefixSum(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum using prefix sum: " + maxSum);
    }

    public static void kadanes(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum <= 0) {
                currentSum = 0;
                }

            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Max sum using Kandane's Algorithm : " + currentSum);
    }

    public static void main(String[] args) {
        int[] numbers = {-1, -2};
        maxSubArraySum(numbers);
        maxSubArraySumUsingPrefixSum(numbers);
        kadanes(numbers);

    }
}
