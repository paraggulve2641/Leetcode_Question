class Solution {
    public int maxProfit(int[] prices) {
    int buy = Integer.MAX_VALUE;
    int profit = 0;
        for(int i : prices){
            if(i<buy){
                buy=i;
            }
            else{
                profit = Math.max(i-buy,profit);
            }
        }
        return profit;
    }
}