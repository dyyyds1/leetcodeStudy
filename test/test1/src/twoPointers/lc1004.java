package twoPointers;

//滑动窗口
public class lc1004 {
    public int longestOnes(int[] nums, int k) {
        int ret=0;
        for(int left=0,right=0,zero=0;right<nums.length;right++){
            if (nums[right]==0) zero++;
            while (zero>k) {
                if (nums[left++]==0){
                    zero--;
                }
            }
            ret=Math.max(ret,right-left+1);
        }

        return ret;
    }
}
