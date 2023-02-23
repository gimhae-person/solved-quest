import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for(int i = 0; i < str.length; i++) {
            answer += str[str.length - i - 1];
        }
        return answer;
    }
}