package DP;

public class lc300 {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        for (int i=0;i<n;i++) dp[i]=1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }

        int ret=0;
        for (int i = 0; i < n; i++) {
            ret=Math.max(ret,dp[i]);
        }
        return ret;
    }
}
