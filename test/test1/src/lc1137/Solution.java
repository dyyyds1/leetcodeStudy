package lc1137;

import java.util.ArrayDeque;

class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for (int i = 3; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[n];
    }

    public int minLength(String s) {
        ArrayDeque<Character> deque=new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(!deque.isEmpty()&&((s.charAt(i)=='D'&&deque.peek()=='C')||(s.charAt(i)=='B'&&deque.peek()=='A'))){
                deque.pop();
            }else {
                deque.push(s.charAt(i));
            }
        }
        return deque.size();
    } 
}