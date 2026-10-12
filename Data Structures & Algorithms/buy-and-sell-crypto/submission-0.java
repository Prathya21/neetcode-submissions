class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int diff=0;
        for(int i=0;i<n;i++){
            int day1=prices[i];
            for(int j=i+1;j<n;j++){
                if(diff<prices[j]-day1){
                    diff=prices[j]-day1;
                }
            }
        }
        return diff;
    }
}
