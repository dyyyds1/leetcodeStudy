package DP;

public class lc1716 {
    public int massage(int[] nums) {
        int n=nums.length;
        int[] f=new int[n];
        int[] g=new int[n];
        f[0]=nums[0];
        for (int i = 1; i < n; i++) {
            f[i]=g[i-1]+nums[i];
            g[i]=Math.max(f[i-1],g[i-1]);
        }
        return Math.max(g[n-1],f[n-1]);
    }
}
