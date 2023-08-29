package DP;

public class lc918 {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int[] f=new int[n+1];
        int[] g=new int[n+1];
        int sum=0,fmax=Integer.MIN_VALUE,gmin=Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int x=nums[i-1];
            f[i]=Math.max(x,x+f[i-1]);
            fmax=Math.max(fmax,f[i]);
            g[i]=Math.min(x,x+g[i-1]);
            gmin=Math.min(gmin,g[i]);
            sum+=x;
        }
        return sum==gmin?fmax:Math.max(fmax,sum-gmin);
    }
}
