package august_Code_Exercise;

public class lc174 {
    public int calculateMinimumHP(int[][] d) {
        int m=d.length,n=d[0].length;
        int[][] dp=new int[m+1][n+1];
        for (int i = 0; i <= n; i++) {
            dp[m][i]=Integer.MAX_VALUE;
        }
        for (int i = 0; i <= m; i++) {
            dp[i][n]=Integer.MAX_VALUE;
        }
        dp[m][n-1]=dp[m-1][n]=1;
        for (int i = m-1; i >=0 ; i--) {
            for (int j = n-1; j>=0; j--) {
                dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])-d[i][j];
                dp[i][j]=Math.max(1,dp[i][j]);
            }
        }

        return dp[0][0];
    }
}
