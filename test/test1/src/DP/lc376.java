package DP;

public class lc376 {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        int[] f=new int[n];
        int[] g=new int[n];
        for (int i=0 ;i<n;i++) f[i]=g[i]=1;
        for (int i = 1; i < n; i++) {
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    f[i]=Math.max(g[j]+1,f[i]);
                }
                else if (nums[j]>nums[i]){
                    g[i]=Math.max(f[j]+1,g[i]);
                }
            }
        }
        int ret=0;
        for (int i = 0; i < n; i++) {
            ret=Math.max(ret,Math.max(f[i],g[i]));
        }
        return ret;
    }
}
