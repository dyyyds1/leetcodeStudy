package lc2523;

import java.util.Arrays;

class Solution {
    public int[] closestPrimes(int left, int right) {
        int pre=-1;
        int rear=-1;
        boolean flag=false;
        int[] arr=new int[2];
        int min=Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (isPrimeNum(i)&&!flag){
                pre=i;
                flag=true;
            } else if (isPrimeNum(i)&&flag) {
                flag=false;
                rear=i;
            }

            if (pre!=-1&&rear!=-1){
                if (Math.abs(pre-rear)<min){
                    arr[0]=pre;
                    arr[1]=rear;
                    Arrays.sort(arr);
                    min=Math.abs(pre-rear);
                }
            }
        }
        if (pre==-1||rear==-1){
            return arr= new int[]{-1, -1};
        }
        return arr;
    }
    public boolean isPrimeNum(int n){
        if (n<2){
            return false;
        } else if (n==2) {
            return true;
        } else if (n%2==0) {
            return false;
        }
        for (int i = 3; i*i <= n ; i+=2) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}