package twoPointers;

import java.util.ArrayList;
import java.util.List;

public class lcr015 {
    public List<Integer> findAnagrams(String ss, String pp) {
        List<Integer> ret=new ArrayList<>();
        char[] s=ss.toCharArray();
        char[] p=pp.toCharArray();
        int n=s.length,m=p.length;
        int[] hash1=new int[26];
        int[] hash2=new int[26];
        for (char c:p) hash1[c-'a']++;
        for (int left=0,right=0,count=0;right<n;right++){
            char in=s[right];
            hash2[in-'a']++;
            if (hash2[in-'a']<=hash1[in-'a']) count++;
            if (right-left+1>count){
                char out=s[left++];
                if (hash2[out-'a']--<=hash1[out-'a']) count--;
            }
            if (count==m){
                ret.add(left);
            }
        }
        return ret;
    }
}
