public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit) {

        // if (newBit == 0) {
        //     return ClearIthBit.clearIthBit(n, i);
        // } else {
        //     return SetIthBit.setIthBit(n, i);
        // }
        return SetIthBit.setIthBit(n, i);

        // n = ClearIthBit.clearIthBit(n, i);
        // int bitmask = newBit<<i;
        // return n | bitmask;
    }

    public static void main(String[] args) {
        int a = updateIthBit(10, 2, 1);
        System.out.println(a);
    }
}
