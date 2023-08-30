package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc446 {
    public int numberOfArithmeticSlices(int[] nums) {
        Map<Long, List<Integer>> map=new HashMap<>();
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            long tmp=(long)nums[i];
            if (!map.containsKey(tmp)){
                map.put(tmp,new ArrayList<>());
            }
            map.get(tmp).add(i);
        }

        int[][] dp=new int[n][n];
        int sum=0;
        for (int j=2;j<n;j++){//固定倒数第一个数
            for (int i = 1; i < j; i++) {
                Long a=2L*nums[i]-nums[j];
                if (map.containsKey(a)){
                    for (int k:map.get(a)) {
                        if (k<i){
                            dp[i][j]+=dp[k][i] +1;
                        }else {
                            break;
                        }
                    }
                }
                sum+=dp[i][j];
            }

        }

        return sum;
    }
}
