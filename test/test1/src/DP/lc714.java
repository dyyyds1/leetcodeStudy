package DP;

public class lc714 {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[] f=new int[n];
        int[] g=new int[n];
        f[0]=-prices[0];
        for (int i = 1; i < n; i++) {
            f[i]=Math.max(f[i-1],g[i-1]-prices[i]);
            g[i]=Math.max(g[i-1],f[i-1]+prices[i]-fee);
        }
        return g[n-1];
    }
}
