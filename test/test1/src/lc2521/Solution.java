package lc2521;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPrimeNum(nums[i])){
                set.add(nums[i]);
            }else {
                int j=2;
                while (j<=nums[i]/2){
                    if (nums[i]%j==0&&isPrimeNum(j)){
                        set.add(nums[i]);
                        while (nums[i]%j==0){
                            nums[i]/=j;
                        }
                    }
                    j++;
                }
            }
        }
        return set.size();
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