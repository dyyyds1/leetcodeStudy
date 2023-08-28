package august_Code_Exercise;

public class lc1567 {
    public int getMaxLen(int[] nums) {
        int n=nums.length;
        int[] f=new int[n+1];
        int[] g=new int[n+1];
        int ret=Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            if (nums[i-1]>0){
                f[i]=f[i-1]+1;
                g[i]=g[i-1]==0?0:g[i-1]+1;
            }
            else if (nums[i-1]<0){
                f[i]=g[i-1]==0?0:g[i-1]+1;
                g[i]=f[i-1]+1;
            }
            ret=Math.max(ret,f[i]);
        }
        return ret;
    }
}
