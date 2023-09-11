package top100;

import java.util.Arrays;

public class lc134 {
    public static void main(String[] args) {
        int i=canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,2,1});
        System.out.println(i);
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int bottom=0,fIndex=-1,sum=0;
        for (int i = 0; i < n; i++) {
            sum+=gas[i]-cost[i];
            if (sum<bottom){
                bottom=sum;
                fIndex=i;
            }
        }
        if (sum<0) return -1;
        return fIndex+1;
    }


}
