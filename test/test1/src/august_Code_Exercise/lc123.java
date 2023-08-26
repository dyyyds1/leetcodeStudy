package august_Code_Exercise;

public class lc123 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] f=new int[n][3];
        int[][] g=new int[n][3];
        f[0][0]=-prices[0];
        f[0][1]=f[0][2]=-0x3f3f3f3f;
        g[0][0]=0;
        g[0][1]=g[0][2]=-0x3f3f3f3f;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                f[i][j]=Math.max(f[i-1][j],g[i-1][j]-prices[i]);
                g[i][j]=g[i-1][j];
                if (j-1>=0) {
                    g[i][j] = Math.max(g[i - 1][j], f[i - 1][j - 1] + prices[i]);
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
