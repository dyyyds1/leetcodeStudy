package DP;



public class lc152 {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int[] f=new int[n+1];
        int[] g=new int[n+1];
        g[0]=f[0]=1;
        int ret=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int x=nums[i-1],y=f[i-1] * nums[i-1],z=g[i-1] * nums[i-1];
            f[i]=Math.max(x,Math.max(y,z));
            g[i]=Math.min(x,Math.min(y,z));
            ret = Math.max(ret,f[i]);
        }
        return ret;
    }
}
