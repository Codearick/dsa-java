import java.util.Scanner;

public class GetIthBit {
    public static int getIthBit(int n, int i){
        int bitmask = 1 << i;
        int res = ((n & bitmask) == 0) ? 0 : 1;

        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // System.out.println("Enter your number: ");
        // int n = scan.nextInt();

        // System.out.println("Enter the ith bit you wanna find: ");
        int i = scan.nextInt();

        scan.close();

        System.out.println("The ith bit is: " + getIthBit(10, i));
    }
}