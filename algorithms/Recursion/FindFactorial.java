// Find the factorial of a given number n

public class FindFactorial {
    public static int findFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * findFactorial(n - 1);
    
    }
    public static void main(String[] args) {
        int ans = findFactorial(10);
        System.out.println(ans);
    }
}
