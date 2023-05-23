package lc1047;

import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (stack.isEmpty()||c!=stack.peek()){
                stack.push(c);
            }else {
                stack.pop();
            }
        }
        String re="";
        while (!stack.empty()){
            re=stack.pop()+re;
        }

        return re;
    }

}