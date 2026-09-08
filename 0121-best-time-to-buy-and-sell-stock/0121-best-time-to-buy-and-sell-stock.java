class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0,maxProfit = 0;
        int minPrices = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] < minPrices){
                minPrices = prices[i];
            }
            else{
                profit = prices[i] - minPrices;

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}