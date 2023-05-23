package lc740;

class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal=0;
        for (int num:nums){
            maxVal=Math.max(num,maxVal);
        }
        int[] res=new int[maxVal];
        for (int i = 0; i < maxVal; i++) {
            res[i]+=nums[i];
        }
        return rob(res);
    }

    public int rob(int[] nums){
        int n= nums.length;
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp=second;
            second=Math.max(first+nums[i],second);
            first=second;
        }
        return second;
    }
}