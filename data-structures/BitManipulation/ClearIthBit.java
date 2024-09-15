
public class ClearIthBit {
    public static int clearIthBit(int n, int i){
        int bitmask = (~(1 << i));
        int res = (n & bitmask);

        return res;
    }
    public static void main(String[] args) {
        System.out.println("The cleared bit is: " + clearIthBit(10, 1));
    }
}