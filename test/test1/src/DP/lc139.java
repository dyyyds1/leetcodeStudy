package DP;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        s=" "+s;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >=1 ; j--) {
                if (dp[j-1]&&set.contains(s.substring(j,j+1))){
                    dp[i]=true;
                }
            }
        }
        return dp[n];

    }

}
