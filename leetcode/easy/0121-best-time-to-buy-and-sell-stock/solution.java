class Solution {
    public int maxProfit(int[] prices) {
        int p = prices.length;
        int in = prices[0];
        int bi = 0;
       for (int i = 0; i < p; i++) {
            if (prices[i] < in) {
                in = prices[i];
                bi= i;
            }
        }
        int profit = 0;

        for( int j =bi+1; j<p;j++){
            if(in < prices[j]){
                profit = Math.max(profit,prices[j]);
                
            }

        }
        return profit - in;
    }
}