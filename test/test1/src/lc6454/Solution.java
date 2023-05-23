package lc6454;

class Solution {
    public String makeSmallestPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        char[] c=s.toCharArray();
        while (l<r){
            if (c[l]!=c[r]){
                if (c[l]<c[r]){
                    c[r]=c[l];
                }else {
                    c[l]=c[r];
                }
            }
            l++;
            r--;
        }
        String tmp="";
        for (int i = 0; i < c.length; i++) {
            tmp+=c[i];
        }
        return tmp;
    }
}