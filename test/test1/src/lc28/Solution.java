package lc28;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 || haystack.length() == 0) {
            return -1;
        }
        int n=haystack.length();
        for (int i = 0; i < n; i++) {
            int j=0;
            int start=i;
            while (j<needle.length()&&i<n&&haystack.charAt(i)==needle.charAt(j)){
                if(j==needle.length()-1){
                    return start;
                }
                j++;
                i++;
            }
            i=i-j;
        }
        return -1;
    }
}