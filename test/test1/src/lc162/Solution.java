package lc162;

class Solution {
    public int findPeakElement(int[] nums) {
        int left=-1,right= nums.length-1;
        while (left+1<right){
            int mid=left+(right-left)/2;
            if (nums[mid] > nums[mid + 1]) right = mid; // 蓝色
            else left = mid; // 红色
        }
        return left;
    }
}