import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println(n+ " is an even number!");
        } else {
            System.out.println(n+ " is an odd number!");
        }

        sc.close();
    }
    
}
