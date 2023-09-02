package twoPointers;

public class lcr016 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars=s.toCharArray();
        int[] hash=new int[128];
        int left=0,right=0,n=s.length(),ret=0;
        while (right<n){
            hash[chars[right]]++;
            while (hash[chars[right]]>1){
                hash[chars[left++]]--;
            }
            ret=Math.max(ret,right-left+1);
            right++;
        }
        return ret;
    }
}
