package twoPointers;

import java.util.HashSet;
import java.util.Set;

public class lc26 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int left=0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])){
                nums[left]=nums[i];
                left++;
            }
            set.add(nums[i]);
        }
        return left;
    }
}
