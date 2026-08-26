class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(nums[l]<nums[r]){
                r--;
            }else if(nums[l]>nums[r]){
                l++;
            }
            if(nums[l]==nums[r]){
                return nums[l];
            }
        }
        return nums[l];
    }
}
