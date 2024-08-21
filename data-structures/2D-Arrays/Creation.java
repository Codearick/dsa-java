import java.util.Scanner;

public class Creation {
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Key is found at cell: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix representation is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter your key: ");
        int key = sc.nextInt();

        if(search(matrix, key)){
            System.out.println("Your key is present in the matrix!");
        } else{
            System.out.println("You key is not present in the matrix!");
        }

    }
}