import java.util.Scanner;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int len = s.length();
        Stack<String>stack = new Stack<String>();
        int flag = 0;
        for(int i=0;i<len;i++) {
        	String temp = s.charAt(i)+"";
        	stack.push(temp);
        }
        if(stack.peek().equals("(")) {
        	return false;
        }
        
        for(int i=0;i<len;i++) {
        	String temp = stack.pop();
        	if(temp.equals(")")) {
        		flag++;
        	}else {
        		flag--;
        		if(flag<0) {
        			return false;
        		}
        	}
        }
        if(flag==0) {
        	return true;
        }
        return false;
    }
}
