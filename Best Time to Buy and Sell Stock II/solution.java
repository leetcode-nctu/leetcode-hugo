public class Solution {
    public int maxProfit(int[] prices) {
        int start = 0,profit = 0;
        for(int i = 1; i < prices.length;i++){
            if(prices[i] < prices[i-1]){
                profit+= (prices[i-1]-prices[start]);
                start = i;
            }else if(i == prices.length-1){
                profit+= (prices[i]-prices[start]);
                start = i;
            }
            
        }
        return profit;
    }
}