public class NumberToString {
    public static void main(String[] args) {
        String [] numArr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        int n = 2012;
        printNumbers(n, numArr);
    }
    public static void printNumbers(int n, String [] arr){
       if(n == 0) return;
       int lastDigit = n%10;
       System.out.print(arr[lastDigit] + " ");
       printNumbers(n/10, arr);
    }
}
