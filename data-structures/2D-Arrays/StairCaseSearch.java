import java.util.Scanner;

public class StairCaseSearch {
    
    public static boolean stairCaseSearch(int [][] matrix, int key){
        //Staircase solution : 1
        // int row = 0;
        // int col = matrix[0].length - 1;

        // while(row < matrix.length && col >= 0){
        //     if(matrix[row][col] == key){
        //         System.out.println("Found key at index " + "(" + row + "," + col + ")");
        //         return true;
        //     }
        //     else if(key < matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Key not found!");
        // return false;

        //Staircase solution: 2: 
        int row = matrix.length - 1;
        int col = 0;

        while(row >= 0 && col < matrix.length){
            if(matrix[row][col] == key){
                System.out.println("Found key at index " + "(" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the key you want to search: ");
        int key = scan.nextInt();

        int [][] matrix = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};

        stairCaseSearch(matrix,key);

        scan.close();
    }
}
