package slideWindow;


//长度最小的子数组
class lc209 {
    public int minSubArrayLen(int target, int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            count+= nums[i];
        }
        if (count < target) {
            return 0;
        }
        int minL=Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
            while (sum>=target){
                int subL=j-i+1;
                minL=Math.min(subL,minL);
                sum-=nums[i++];
            }
        }

        return minL;
    }
}