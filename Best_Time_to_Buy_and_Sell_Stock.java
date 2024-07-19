class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int var=prices[i]-buy;
            if(var>p){
                p=var;
            }
        }
        return p;
    }
}
