# 2D Arrays - Solutions

This file contains Java code solutions for the 2D array practice questions.

---

### **Solution 1: Count the Number of 7’s in a 2D Array**

```java
public class Solution {
    public static void main(String[] args) {
        int[][] array = { 
            {4, 7, 8}, 
            {8, 8, 7} 
        };
        
        int countOf7 = 0;
        
        // Traverse the 2D array to count the occurrences of 7
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        
        System.out.println("Count of 7 is: " + countOf7);
    }
}
```

---

### **Solution 2: Sum of Numbers in the Second Row**

```java
public class Solution {
    public static void main(String[] args) {
        int[][] nums = { 
            {1, 4, 9}, 
            {11, 4, 3}, 
            {2, 2, 3} 
        };
        
        int sum = 0;
        
        // Calculate the sum of the second row (index 1)
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        
        System.out.println("Sum is: " + sum);
    }
}
```

---

### **Solution 3: Transpose of a Matrix**

```java
public class Solution {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { 
            {2, 3, 7}, 
            {5, 6, 7} 
        };
        
        // Display the original matrix
        printMatrix(matrix);
        
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Print the transposed matrix
        printMatrix(transpose);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

### **Happy Coding!**

