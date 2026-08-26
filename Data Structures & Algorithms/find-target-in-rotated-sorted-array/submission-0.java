class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(nums[l]==target){
                return l;
            }else if(nums[r]==target){
                return r;
            }
            else if(nums[l]<target || nums[r]>target || nums[l]>target || nums[r]<target){
                l++;
                r--;
            }
        }
        return -1;
    }
}
