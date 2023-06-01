package lc42;

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int fMax=0;
        int rMax=0;
        int[] arrFr=new int[n];
        int[] arrRe=new int[n];
        arrFr[0]=height[0];
        arrRe[n-1]=height[n-1];
        for (int i = 1; i < n; i++) {
            fMax=Math.max(arrFr[i-1],height[i]);
            arrFr[i]=fMax;
        }
        for (int i = n-2; i >=0 ; i--) {
            rMax=Math.max(arrRe[i+1],height[i]);
            arrRe[i]=rMax;
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans+=Math.min(arrFr[i],arrRe[i])-height[i];
        }
        return ans;
    }
}