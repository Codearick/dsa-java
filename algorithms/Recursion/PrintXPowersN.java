//WAP to fint the power of X by N. (X^N)
// Author: Rohan Gautam(SELF)
// Date: 23/09/2024
//----------------------> Java <---------------------

public class PrintXPowersN {
    public static void main(String[] args) {
        int ans = printPower(2, 6);
        System.out.println(ans);
    }

    // Time complexity: O(n)
    // public static int printPower(int x, int n){
    // if(n == 1) return x * n;

    // return x * printPower(x, n - 1);
    // }

    // ---------------> Optimised function <-----------------
    // ---------------> Time Complexity: O(logn) <-------------------
    public static int printPower(int x, int n) {

        int ans = 0;

        if (n == 1) {
            return x;
        }

        int halfAns = printPower(x, (n / 2));

        ans = halfAns * halfAns;

        if (n % 2 != 0) {
            ans *= x;
        }

        return ans;  

    }
}
