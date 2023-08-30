package DP;

import java.util.HashMap;
import java.util.Map;

public class lc873 {
    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }

        int n=arr.length;
        int[][] dp=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j]=2;
            }
        }
        int ret=2;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                int a=arr[i]-arr[j];
                if (a<arr[j]&&map.containsKey(a)){
                    dp[j][i]=dp[map.get(a)][j]+1;
                }
                ret=Math.max(ret,dp[j][i]);

            }
        }

        return ret<3?0:ret;
    }
}
