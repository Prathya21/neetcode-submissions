class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int l=0,r=l+1;
        int max=0;
        while(l<r && l<n && r<n){
            if(prices[l]<prices[r]){
                max=Math.max(max,prices[r]-prices[l]);
                r++;
            }else{
                l=r;
                r++;
            }
        }
        return max;
    }
}
