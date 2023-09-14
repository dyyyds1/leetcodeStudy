package bitOperations.m0101;

class Solution {
    public boolean isUnique(String astr) {
        char[] chars= astr.toCharArray();
        int hash=0;
        for (int i = 0; i < chars.length; i++) {
            int cur=chars[i]-'a';
            if ((hash&(1<<cur))!=0){
                return false;
            }
            hash|=1<<cur;

        }

        return true;
    }
}