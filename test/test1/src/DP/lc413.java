package DP;

public class lc413 {
    public int numberOfArithmeticSlices(int[] nums) {
        //1. 创建dp表
        //2. 初始化
        //3. 填表
        //4. 返回值
        int n=nums.length;
        int sum=0;
        int[] dp=new int[n];
        for (int i = 2; i < n; i++) {
            dp[i]=nums[i]-nums[i-1]==nums[i-1]-nums[i-2]?dp[i-1]+1:0;
            sum+=dp[i];
        }
        return sum;
    }
}
