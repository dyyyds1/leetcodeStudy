package lc151;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world   "));
    }
    //  hello world
    public static String reverseWords(String s) {
        String[] ans=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = ans.length-1; i >=0 ; i--) {
            if (!ans[i].equals(" ")){
                sb.append(ans[i]+" ");
            }
        }
        while (sb.charAt(sb.length()-1)==' '){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}