public class InsertionSort {
    public static void main(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > current){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = current;
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
    public static void main(String[] args){
        int [] arr = {2,1,5,6,3,7,4};
        main(arr);
    }
}