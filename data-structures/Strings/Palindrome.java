import java.util.*;

public class Palindrome {
    public static boolean palindromeChecker(String word){
        String tempWord = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            if(tempWord.charAt(i) != tempWord.charAt(tempWord.length() - 1 - i)){
                //not a palindrome
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while( i < 10){
            System.out.println("Enter your word to check palindrome: ");
            String word = sc.next();
    
            boolean checker = palindromeChecker(word);
            System.out.println(checker == false ? "It is not a palindrome!" : "It is a palindrome!");
            System.out.println();

            i++;
        }

        sc.close();
    }
}
