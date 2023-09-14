package bitOperations.m1719;

class Solution {
    public int[] missingTwo(int[] nums) {
        int tmp=0;
        for (int num:nums) tmp^=num;
        for (int i=0;i<=nums.length+2;i++) tmp^=nums[i];
        int diff=0;
        while (true){
            if (((tmp>>diff)&1)==1) break;
            else diff++;
        }

        int[] ret=new int[2];
        for (int x:nums){
            if (((x>>diff)&1)==1) ret[1]^=x;
            else ret[0]^=x;
        }
        for (int i = 0; i <= nums.length+2; i++) {
            if (((i>>diff)&1)==1) ret[1]^=i;
            else ret[0]^=i;
        }

        return ret;
    }
}