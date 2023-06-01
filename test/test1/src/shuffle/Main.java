package shuffle;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int num=in.nextInt();
        while (num>0) { // 注意 while 处理多个 case
            int n= in.nextInt();
            int k=in.nextInt();
            int[] arr=new int[2*n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=in.nextInt();
            }
            shuffleK(arr,n,k);
            num--;
        }

    }
    public static void shuffleK(int[] card,int n,int k){
        for (int i = 0; i < k; i++) {
            int[] newCard=new int[card.length];
            for (int j = 0; j < n; j++) {
                newCard[j*2]=card[j];
                newCard[j*2+1]=card[j+n];
            }
            card=newCard;
        }
        printArr(card);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.print(arr[arr.length-1]);
    }
    public static int minOperations(int[] nums, int x) {
        int target=-x;
        for (int num:nums){
            target+=num;
        }
        if (target<0){
            return -1;
        }
        int ans=-1,left=0,sum=0,n= nums.length;
        for (int right = 0; right < n; right++) {
            sum+=nums[right];
            while (sum>target){
                sum-=nums[left++];
            }
            if (target==sum) {
                ans = Math.max(ans, right - left + 1);
            }
        }
        return ans>=0?n-ans:-1;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,1,4,2,3},5));
    }
}