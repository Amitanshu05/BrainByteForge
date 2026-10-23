class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int maxPrice = prices[prices.length-1];

       for(int i = prices.length - 2 ; i >= 0 ;i--){
        int profit = maxPrice - prices[i];
        maxProfit = Math.max(profit,maxProfit);
        maxPrice = Math.max(maxPrice,prices[i]);
       } 

       return maxProfit;
    }
}