package DP;

import java.util.Arrays;

public class lc646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[0] - b[0]);
        int n=pairs.length;
        int[] dp=new int[n];
        for (int i=0;i<n;i++) dp[i]=1;
        int ret=1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0]>pairs[j][1]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            ret=Math.max(ret,dp[i]);
        }
        return ret;
    }

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] f=new int[n][3];
        int[][] g=new int[n][3];
        f[0][1]=f[0][2]=-0x3f3f3f3f;
        f[1][0]=f[2][0]=-0x3f3f3f3f;
        g[0][0]=0;
        f[0][0]=-prices[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                f[i][j]=Math.max(f[i-1][j],g[i-1][j]-prices[i]);
                g[i][j]=g[i-1][j];
                if (j-1>=0){
                    g[i][j]=Math.max(g[i-1][j],f[i-1][j-1]+prices[i]);
                }
            }
        }
        int ret=0;
        for (int i = 0; i < 3; i++) {
            ret=Math.max(ret,g[n-1][i]);
        }
        return ret;
    }
}
