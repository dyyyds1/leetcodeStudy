package top100;

import java.util.HashMap;
import java.util.Map;

public class lc560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ret=0;
        for (int x:nums){
            sum+=x;
            ret+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return ret;
    }
}
