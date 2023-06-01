package slideWindow;

class lc1004 {
    public int longestOnes(int[] nums, int k) {
        int ans=0,cot=0,left=0,n=nums.length;
        for (int right = 0; right < n; right++) {
            cot+=1-nums[right];
            while (cot>k){
                cot-=1-nums[left++];
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}