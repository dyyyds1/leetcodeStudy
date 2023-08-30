package DP;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class lc1218 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for (int val:arr){
            map.put(val,map.getOrDefault(val-difference,0)+1);
            ans=Math.max(ans,map.get(val));
        }
        return ans;
    }
}
