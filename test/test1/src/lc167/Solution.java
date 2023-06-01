package lc167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int right=numbers.length-1;
       int left=0;
       while (left<right){
           if (numbers[left]+numbers[right]>target){
               right--;
           } else if (numbers[left]+numbers[right]<target) {
               left++;
           }else {
               return new int[]{left,right};
           }
       }
       return new int[]{-1,-1};
    }
}