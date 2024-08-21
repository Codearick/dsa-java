public class SpiralMatrix {
    public static void printSpiralMatrix(int [][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1; 
        int endCol = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol){
            //Top border
            for(int i = startCol; i <= endCol; i++){
                System.out.print(matrix[startRow][i] + " ");
            }

            // Right border
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom Border
            for (int i = endCol - 1; i >= startCol; i--) {
                if(startRow == endRow){
                    System.out.println("Start and end row are same!");
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            
            // Left border 
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol ){
                    System.out.println("start col and end col are");
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;

            endRow--;
            endCol--;
        
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}
