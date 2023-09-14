package bitOperations.lc371;

class Solution {
    public int getSum(int a, int b) {
        while (b!=0){
            int x=a^b;
            int carry=(a&b)<<1;
            a=x;
            b=carry;
        }

        return a;
    }
}