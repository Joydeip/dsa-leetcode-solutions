// leetcode 121, Best Time to Buy and Sell Stock 

class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for(int i=1;i<prices.length;i++){
            min_price = Math.min(prices[i],min_price);
            maxprof = Math.max(maxprof,prices[i] - min_price);
        }

        return maxprof;
    }
}