import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        answer += Character.toUpperCase(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == ' ') answer += arr[i];
            else if(arr[i - 1] == ' ' && arr[i] != ' ') answer += Character.toUpperCase(arr[i]);
            else if(arr[i - 1] != ' ' && arr[i] != ' ') answer += Character.toLowerCase(arr[i]);
        }
        return answer;
    }
}