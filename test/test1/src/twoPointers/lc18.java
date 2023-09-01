package twoPointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ret=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i < n; ) {
            for (int j = i+1; j < n; ) {
                int left=j+1,right=n-1;
                long aim=(long)target-nums[i]-nums[j];
                while (left<right){
                    int sum=nums[left]+nums[right];
                    if (sum<aim) left++;
                    else if (sum>aim) right--;
                    else {
                        ret.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right])));
                        left++;right--;
                        while (left<right&&nums[left]==nums[left-1]) left++;
                        while (left<right&&nums[right]==nums[right+1]) right--;
                    }
                }

                j++;
                while (j<n&&nums[j]==nums[j-1]) j++;
            }
            i++;
            while (i<n&&nums[i]==nums[i-1]) i++;
        }
        return ret;
    }
}
