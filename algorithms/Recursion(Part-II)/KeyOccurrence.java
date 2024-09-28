public class KeyOccurrence {
    public static void main(String[] args) {
        int [] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printOccurrence(arr, 2, 0);
    }

    public static void printOccurrence(int [] arr, int key, int index){
        if(index == arr.length) return;

        if(arr[index] == key){
            System.out.print(index + " ");
        }
        printOccurrence(arr, key, index + 1);
    }
}
