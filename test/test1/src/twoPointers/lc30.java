package twoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ret=new ArrayList<>();
        Map<String,Integer> hash1=new HashMap<>();
        int len=words[0].length(),m= words.length;
        for (String word:words) hash1.put(word,hash1.getOrDefault(word,0)+1);
        for (int i = 0; i < len; i++) {
            Map<String,Integer> hash2=new HashMap<>();
            for (int left=i,right=i,count=0; right +len<=s.length(); right+=len) {
                String in=s.substring(right,right+len);
                hash2.put(in,hash2.getOrDefault(in,0)+1);
                if (hash2.get(in)<=hash1.getOrDefault(in,0)) count++;
                if (right-left+1>len*m){
                    String out=s.substring(left,left+len);
                    if (hash2.get(out)<=hash1.getOrDefault(out,0)) count--;
                    hash2.put(out,hash2.get(out)-1);
                    left+=len;
                }
                if (count==m){
                    ret.add(left);
                }
            }

        }
        return ret;
    }
}
