package twoPointers;

import java.util.ArrayList;
import java.util.List;

public class lc438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret=new ArrayList<>();
        char[] cs=s.toCharArray();
        char[] cp=p.toCharArray();
        int n=s.length(),m=p.length();
        int[] hash1=new int[26];
        int[] hash2=new int[26];
        for (char p1:cp) hash1[p1-'a']++;
        for (int left=0,right=0,count=0;right<n;right++){
            char in=cs[right];

            if (++hash2[in-'a']<=hash1[in-'a']) count++;
            if (right-left+1>m){
                char out=cs[left++];
                if (hash2[out-'a']--<=hash1[out-'a']) count--;
            }
            if (count==m) ret.add(left);
        }
        return ret;
    }
}

