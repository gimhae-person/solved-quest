import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int n = 0; 
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j]) && i != j) {
                    n++;
                }
            }
            if(n == 0) answer += arr[i];
            n = 0;
        }
        return answer;
    }
}