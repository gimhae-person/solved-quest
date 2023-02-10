import java.util.*;

class Solution {
    public int solution(int n) {
        String num = n + "";
        String[] arr = num.split("");
        
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
            answer +=  Integer.parseInt(arr[i]);
        }
        return answer;
    }
}