// Find the Fibonacci number of Nth number. 

public class NthFibonacci {
    public static int findFib(int n) {
        int ans = 0;
        // if (n == 0) return 0;
        // if(n == 1) return 1;
        if(n <= 1) return n;

        ans = findFib(n - 1) + findFib(n - 2);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findFib(25));
    }
}