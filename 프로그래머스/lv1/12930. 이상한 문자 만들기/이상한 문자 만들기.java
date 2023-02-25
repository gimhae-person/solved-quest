import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                answer += arr[i];
                idx = 0;
            }
            else {
                if(idx % 2 == 0) {
                    answer += Character.toUpperCase(arr[i]);
                } else {
                    answer += Character.toLowerCase(arr[i]);
                }
                idx++;
            }
        }
        return answer;
    }
}