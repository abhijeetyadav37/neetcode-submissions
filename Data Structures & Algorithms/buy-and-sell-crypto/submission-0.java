class Solution {
    public int maxProfit(int[] prices) {

        // Lowest price seen so far
        int minPrice = prices[0];

        // Maximum profit found so far
        int maxProfit = 0;

        // Start from the second day
        for (int i = 1; i < prices.length; i++) {

            // If today's price is lower, update minimum buying price
            minPrice = Math.min(minPrice, prices[i]);

            // Profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}