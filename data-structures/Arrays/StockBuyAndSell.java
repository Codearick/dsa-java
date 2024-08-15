public class StockBuyAndSell {
    public static int buyAndSell(int [] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){ //profit 
                int currentProfit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 6, 4};
        int res = buyAndSell(prices);
        System.out.println(res);
    }
}
