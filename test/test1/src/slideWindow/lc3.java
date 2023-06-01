package slideWindow;

import java.util.HashSet;
import java.util.Set;

class lc3 {
    public int lengthOfLongestSubstring(String s) {
        int rk=-1;
        int ans=0;
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i!=0){
                set.remove(s.charAt(i-1));
            }
            while (rk+1<s.length()&&!set.contains(s.charAt(rk+1))){
                set.add(s.charAt(rk+1));
                rk++;
            }
            ans=Math.max(ans,rk-i+1);
        }
        return ans;
    }
}