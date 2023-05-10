package lc541;

class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        char[] c=s.toCharArray();
        for (int i = 0; i < n; i+=2*k) {
            reverse(c,i,Math.min(i+k,n)-1);
        }
        return new String(c);
    }
    public void reverse(char[] c,int start,int end){
        while (start<end){
            char tmp=c[start];
            c[start]=c[end];
            c[end]=tmp;
            start++;
            end--;
        }
    }
}