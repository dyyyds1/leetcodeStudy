package top100;

import java.util.Arrays;

public class lc274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=0,i=citations.length-1;
        while (i>=0&&citations[i]>h){
            h++;
            i--;
        }
        return h;
    }
}
