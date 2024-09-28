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

