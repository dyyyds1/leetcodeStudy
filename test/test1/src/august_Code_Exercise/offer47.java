package august_Code_Exercise;

public class offer47 {
    public int maxValue(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j]=Math.max(grid[i-1][j],grid[i][j-1])+grid[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}
