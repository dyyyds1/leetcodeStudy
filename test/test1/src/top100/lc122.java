package top100;

import java.util.Map;

public class lc122 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if (n<2) return 0;
        int[][] dp=new int[n+1][2];
        dp[0][0]=-prices[0];
        for (int i = 1; i <=n ; i++) {
            dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]+prices[i-1]);
            dp[i][0]= Math.max(dp[i-1][0],dp[i-1][1]-prices[i-1]);
        }

        return Math.max(dp[n][0], dp[n][1]);
    }
}
