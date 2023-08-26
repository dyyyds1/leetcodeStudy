package august_Code_Exercise;

public class lc188 {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][] f=new int[n][k+1];
        int[][] g=new int[n][k+1];
        for (int i=1;i<=k;i++) f[0][i]=-0x3f3f3f3f;
        for (int i=1;i<=k;i++) g[0][i]=-0x3f3f3f3f;
        f[0][0]=-prices[0];
        g[0][0]=0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <=k ; j++) {
                f[i][j]=Math.max(f[i-1][j],g[i-1][j]-prices[i]);
                g[i][j]=g[i-1][j];
                if (j-1>=0){
                    g[i][j]=Math.max(g[i][j],f[i-1][j-1]+prices[i]);
                }
            }
        }
        int ret=0;
        for (int i=0;i<=k;i++) ret=Math.max(g[n-1][i],ret);
        return ret;
    }
}
