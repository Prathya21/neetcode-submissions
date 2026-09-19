class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int b=0;
        int h=0;
        int max=0;
        int l=0,r=n-1;
        while(l<r){
            b=r-l;
            h=Math.min(heights[l],heights[r]);
            if(b*h>max){
                max=b*h;
            }
            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
