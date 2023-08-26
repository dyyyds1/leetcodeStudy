package august_Code_Exercise;

public class lc53 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        int ret=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            dp[i]=Math.max(nums[i-1],nums[i-1]+dp[i-1]);
            ret=Math.max(ret,dp[i]);
        }
        return ret;
    }
}
