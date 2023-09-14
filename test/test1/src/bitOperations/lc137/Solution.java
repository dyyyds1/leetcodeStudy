package bitOperations.lc137;

class Solution {
    public int singleNumber(int[] nums) {
        int ret=0;
        for (int i = 0; i < 32; i++) {
            int sum=0;
            for (int x:nums){
                if (((x>>i)&1)==1){
                    sum++;
                }
            }
            sum%=3;
            if (sum==1) ret|=1<< i;
        }
        return ret;
    }
}