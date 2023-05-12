package lc28;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 || haystack.length() == 0) {
            return -1;
        }
        int re = -1;
        char[] c1 = haystack.toCharArray();
        char[] c2 = needle.toCharArray();

        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            int start = i;
            while (i < haystack.length() && j < needle.length() && c1[i] == c2[j]) {
                if (j == c2.length-1) {
                    return start;
                }
                i++;
                j++;
            }
            i=i-j;
        }
        return re;
    }
}