import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;
        int i = 1;
        
        while(Math.pow(i, 2) <= n) {
            if(Math.pow(i, 2) == n) {
                answer = (long)Math.sqrt(n) + 1;
                answer *= answer;
            }
            i++;
        } 
        return answer;
    }
}