package DP;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class lc1027 {
    public int longestArithSeqLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        int n=nums.length;
        int[][] dp=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j]=2;
            }
        }
        int ret=2;
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int a=2*nums[i]-nums[j];
                if (map.containsKey(a)){
                    dp[i][j]=dp[map.get(a)][i]+1;
                    ret=Math.max(ret,dp[i][j]);
                }
                map.put(nums[i],i);
            }
        }

        return ret<3?2:ret;
    }
}
