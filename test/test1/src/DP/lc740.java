package DP;

public class lc740 {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        int[] arr=new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]+=nums[i];
        }
        return rob(arr);

    }

    public int rob(int[] nums){
        int n=nums.length;
        int[] f=new int[n];
        int[] g=new int[n];
        f[0]=nums[0];
        for (int i = 1; i < n; i++) {
            f[i]=g[i-1]+nums[i];
            g[i]=Math.max(f[i-1],g[i-1]);
        }
        return Math.max(f[n-1],g[n-1]);
    }
}
