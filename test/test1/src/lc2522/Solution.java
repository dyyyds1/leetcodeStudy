package lc2522;

class Solution {
    public int minimumPartition(String s, int k) {
        int len = s.length();
        long mem = (long) (s.charAt(0)-'0');
        int count = 1;
        long lk = k;
        for (int i = 1; i < len; i++) {
            int num = s.charAt(i) - '0';
            long m = mem * 10 + num;
            if (m<=lk) {
                mem = m;
            } else {
                if (num>k) {
                    return -1;
                }
                mem = num;
                count++;
            }
        }
        return count;
    }
}
