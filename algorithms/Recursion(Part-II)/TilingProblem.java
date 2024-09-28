public class TilingProblem{
    public static void main(String [] args){
        System.out.println(tilingWays(5));
    }

    public static int tilingWays(int n){
        // base case 
        if(n <= 1) return 1;
        //for vertical 
        int verticalWays = tilingWays(n - 1);
        
        //for horizontal
        int horWays = tilingWays(n - 2);

        int totalWays = verticalWays + horWays;
        return totalWays;
    }
}


