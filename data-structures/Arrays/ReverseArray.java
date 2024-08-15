public class ReverseArray {
    public static int [] reverseArray(int [] n){
        int start = 0; int end = n.length -1; int temp = 0;
        for (int i = 0; i < n.length; i++) {
            if(start < end){
                temp = n[start];
                n[start] = n[end];
                n[end] = temp;
            }
            start++;
            end--;
        }
        return n;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};

        reverseArray(arr);
        System.out.print("The reversed array is: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
