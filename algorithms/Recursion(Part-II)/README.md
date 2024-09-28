# Recursion Problems - README

This README file provides an overview of five basic to intermediate-level recursion problems. Each problem is explained, and the task requirements are specified. These problems aim to deepen your understanding of recursion in programming. 

## Problem 1: Find All Occurrences of a Key in an Array

### Task:
Given an integer array of size `N`, find all occurrences (indices) of a given element (`key`) and print them using recursion.

### Sample Input:
``` 
arr = [3, 2, 4, 5, 6, 2, 7, 2, 2]
key = 2
```

### Sample Output:
```
1 5 7 8
```

### Approach:
- Create a recursive function that traverses the array.
- Check if the current element matches the key and if so, store the index.
- Return the indices after the entire array is traversed.

---

## Problem 2: Number to English String Conversion

### Task:
You are given a number (e.g., 2019), and you need to convert it into a string of its English word equivalents (e.g., "two zero one nine"). Solve this using recursion.

### Sample Input:
```
number = 1947
```

### Sample Output:
```
"one nine four seven"
```

### Approach:
- Create a recursive function that processes each digit of the number from right to left.
- For each digit, append the corresponding English word and recursively process the rest of the number.

---

## Problem 3: Length of a String Using Recursion

### Task:
Write a recursive program to find the length of a given string.

### Sample Input:
```
S = "hello"
```

### Sample Output:
```
5
```

### Approach:
- Use recursion to break down the string character by character, returning `1` for each character until the string is empty.

---

## Problem 4: Count Contiguous Substrings with Same Start and End Characters

### Task:
Given a string `S`, find the count of all contiguous substrings that start and end with the same character.

### Sample Input 1:
```
S = "abcab"
```

### Sample Output 1:
```
7
```

### Sample Input 2:
```
S = "aba"
```

### Sample Output 2:
```
4
```

### Approach:
- Use recursion to generate all possible substrings.
- Check whether each substring's first and last characters are the same.
- Count those that satisfy the condition.

---

## Problem 5: Tower of Hanoi

### Task:
Solve the Tower of Hanoi problem for `N` disks using recursion. The goal is to move all disks from the first tower to the last (from rod `A` to rod `C`), adhering to the following rules:
1. Only one disk can be moved at a time.
2. A disk can only be placed on a larger disk.

### Example for N = 2:
```
Step 1: Shift disk 1 from 'A' to 'B'.
Step 2: Shift disk 2 from 'A' to 'C'.
Step 3: Shift disk 1 from 'B' to 'C'.
```

### Example for N = 3:
```
Step 1: Shift disk 1 from 'A' to 'C'.
Step 2: Shift disk 2 from 'A' to 'B'.
Step 3: Shift disk 1 from 'C' to 'B'.
Step 4: Shift disk 3 from 'A' to 'C'.
Step 5: Shift disk 1 from 'B' to 'A'.
Step 6: Shift disk 2 from 'B' to 'C'.
Step 7: Shift disk 1 from 'A' to 'C'.
```

### Approach:
- Move the top `n-1` disks from the source tower (`A`) to an auxiliary tower (`B`).
- Move the nth disk from the source tower to the destination tower (`C`).
- Move the `n-1` disks from the auxiliary tower to the destination tower.

---

### How to Run the Programs:
1. Implement each problem in your preferred programming language (Python, Java, C++, etc.).
2. Call the recursive function for each problem using the given sample inputs.
3. Print the results based on the sample output format.

### Dependencies:
- Basic understanding of recursion.
- Knowledge of array and string manipulation.

# Solutions
---

## **Solution 1: Find All Occurrences of a Key in an Array**

### Problem:
Find all the occurrences of a given element (`key`) in an array and print their indices using recursion.

### Code:
```java
public class Solution {
    public static void allOccurrences(int arr[], int key, int i) {
        // Base case: If index reaches the length of the array, stop recursion
        if (i == arr.length) {
            return;
        }
        // If the current element matches the key, print the index
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        // Recursive call to check the next element
        allOccurrences(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}; // Sample array
        int key = 2; // Element to find
        allOccurrences(arr, key, 0); // Start recursion from index 0
        System.out.println();
    }
}
```

---

## **Solution 2: Convert Number to English String**

### Problem:
Convert a number into its English string representation using recursion.

### Code:
```java
public class Solution {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static void printDigits(int number) {
        // Base case: If number is 0, return
        if (number == 0) {
            return;
        }
        // Recursive call to process the remaining digits
        int lastDigit = number % 10;
        printDigits(number / 10); // Process the number from right to left
        System.out.print(digits[lastDigit] + " "); // Print the last digit in words
    }

    public static void main(String[] args) {
        printDigits(1234); // Sample input
        System.out.println();
    }
}
```

---

## **Solution 3: Find the Length of a String Using Recursion**

### Problem:
Find the length of a given string using recursion.

### Code:
```java
public class Solution {
    public static int length(String str) {
        // Base case: When the string is empty, return 0
        if (str.length() == 0) {
            return 0;
        }
        // Recursive call: Shorten the string and add 1 for the current character
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abcde"; // Sample input string
        System.out.println(length(str)); // Output the length
    }
}
```

---

## **Solution 4: Count Contiguous Substrings with Same Start and End Characters**

### Problem:
Count all contiguous substrings that start and end with the same character using recursion.

### Code:
```java
public class Solution {
    public static int countSubstrs(String str, int i, int j, int n) {
        // Base cases
        if (n == 1) return 1; // Single character is always a valid substring
        if (n <= 0) return 0; // No valid substrings for empty input
        
        // Recursion to find the count of substrings
        int res = countSubstrs(str, i + 1, j, n - 1) + 
                  countSubstrs(str, i, j - 1, n - 1) - 
                  countSubstrs(str, i + 1, j - 1, n - 2);
        
        // If the first and last characters are the same, increment the result
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab"; // Sample input
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n)); // Output the count of valid substrings
    }
}
```

---

## **Solution 5: Tower of Hanoi**

### Problem:
Solve the Tower of Hanoi problem for `n` disks using recursion, transferring disks from rod A to rod C.

### Code:
```java
public class Solution {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // Base case: If there is only one disk, move it directly
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Move n-1 disks from source to helper using destination as auxiliary
        towerOfHanoi(n - 1, src, dest, helper);
        
        // Move nth disk from source to destination
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        
        // Move n-1 disks from helper to destination using source as auxiliary
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4; // Number of disks
        towerOfHanoi(n, "A", "B", "C"); // Call the recursive function
    }
}
```

### Note:
- The Tower of Hanoi solution is a classic recursion problem that uses divide-and-conquer strategy. Each step involves solving smaller sub-problems and then building the solution.

