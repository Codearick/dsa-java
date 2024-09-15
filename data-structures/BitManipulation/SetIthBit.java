

public class SetIthBit {
    public static int setIthBit(int n, int i){
        int bitmask = (1 << i);
        int res = (n | bitmask);

        return res;
    }

    public static void main(String [] args){
        System.out.println("The set bit is: " + setIthBit(10, 2));
    }
}
