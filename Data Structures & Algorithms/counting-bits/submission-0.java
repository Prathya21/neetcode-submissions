class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<n+1;i++){
            int res=0;
            for(int j=0;j<32;j++){
                if((1<<j & i)!=0){
                    res++;
                }
            }
            arr[i]=res;
        }
        return arr;
    }
}
