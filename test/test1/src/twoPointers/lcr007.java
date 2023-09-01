package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lcr007 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i < n; ) {
            int left=i+1,right=n-1,target=-nums[i];
            while (left<right){
                int sum=nums[left]+nums[right];
                if (sum>target) right--;
                else if (sum<target) left++;
                else {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
            i++;
            while (i<n&&nums[i]==nums[i-1]) i++;
        }
        return res;
    }
}
