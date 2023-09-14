package bitOperations.lc338;

class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=Integer.bitCount(i);
        }
        return arr;
    }
}