class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int max=1;
        int cur=1;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i+1]-nums[i]==1){
                cur++;
            }else{
                max=Math.max(max,cur);
                cur=1;
            }
        }
        return Math.max(cur,max);
    }
}
