package top100;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class lc974 {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);
        int sum=0,ret=0;
        for (int x:nums){
            sum+=x;
            int r=(sum%k+k)%k;
            ret+=hash.getOrDefault(r,0);
            hash.put(r,hash.getOrDefault(r,0)+1);
        }
        return ret;
    }
}
