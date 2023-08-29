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
}
