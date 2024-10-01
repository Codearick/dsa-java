public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(toh(64, 'A', 'B', 'C'));
    }

    public static long toh(int n, char src, char aux, char dest){
        if(n == 1){
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return 1;
        }

        long count = toh(n - 1, src, aux, dest);

        System.out.println("Move disk " + n + " from " + src + " to " + dest );
        count++;

        count += toh(n - 1, aux, dest, src);

        return count;
    }
}
