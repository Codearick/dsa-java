// Reverse a given string using Recursion. 

public class ReverseString {
    public static void reverseString(String str, int idx){
        if(idx >= str.length()){
            return;
        }
        reverseString(str, idx + 1);
        System.out.print(str.charAt(idx) + " ");
    }
    public static void main(String[] args) {
        reverseString("Rohan", 0);
    }
}
