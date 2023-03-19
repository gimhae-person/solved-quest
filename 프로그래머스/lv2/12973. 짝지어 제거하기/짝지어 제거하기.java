import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
       
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        
        
        for(int i = 1; i < s.length(); i++) {
            if(stack.search(s.charAt(i)) == 1) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
            
        }
        
        if(stack.empty()) answer = 1;
        
        
        return answer;
    }
}