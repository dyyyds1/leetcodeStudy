package bitOperations.lc268;

class Solution {
    public int missingNumber(int[] nums) {
        int ret=0;
        for (int num:nums) ret^=num;
        for (int i = 0; i <= nums.length; i++) ret^=i;
        return ret;
    }
}