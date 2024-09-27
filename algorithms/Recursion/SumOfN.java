//Find the sum of N natural number using Recursion. 

public class SumOfN {
    public static int findSum(int n){
        if(n <= 1){
            return 1;
        }
        int sum = n + findSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(findSum(5));
    }
}
