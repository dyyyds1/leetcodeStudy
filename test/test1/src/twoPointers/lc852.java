package twoPointers;

public class lc852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1;
        while (left<right){
            int mid = (arr[left]-arr[right])/2+arr[right];
            if (arr[mid]<arr[mid-1]){
                right=mid-1;
            } else {
                left=mid;
            }
        }
        return left;
    }
}
