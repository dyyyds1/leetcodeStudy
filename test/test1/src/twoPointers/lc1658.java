package twoPointers;

public class lc1658 {
    public static int minOperations(int[] nums, int x) {
        int sum=0,len=-1;
        int n=nums.length;
        for (int i=0;i<n;i++) sum+=nums[i];
        int target=sum-x;
        if (target<0){
            return -1;
        }
        sum=0;
        for(int left=0,right=0;right<n;right++){
            sum+=nums[right];
            while (sum>target){
                sum-=nums[left++];
            }
            if (sum ==target) {
                len = Math.max(len, right - left + 1);
            }
        }
        if (len==-1){
            return len;
        }
        return n-len;
    }
}
