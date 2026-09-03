class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];

        for (int p : prices) {
            buyPrice = Math.min(buyPrice, p);
            profit = Math.max(profit, p-buyPrice);
        }
        return profit;
    }
}