package lc2520;

class Solution {
    public int countDigits(int num) {
        int n=num;
        int ans=0;
        while (n>0){
            int ge=n%10;
            n/=10;
            if (num%ge==0){
                ans++;
            }
        }
        return ans;
    }
}