package DP;

public class lc673 {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] len=new int[n];
        int[] count=new int[n];
        for (int i = 0; i < n; i++) {
            len[i]=count[i]=1;
        }
        int retLen=1,retCount=1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]){
                    if (len[j]+1==len[i]){
                        count[i]+=count[j];
                    }
                    else if (len[j]+1>len[i]){
                        len[i]=len[j]+1;
                        count[i]=count[j];
                    }
                }
            }
            if (retLen==len[i]) retCount+=count[i];
            else if (retLen<len[i]){
                retLen=len[i];
                retCount=count[i];
            }
        }
        return retCount;
    }
}
