import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] str = (my_string).toCharArray();
        for(int i = 0; i < str.length; i++) {
            if(Character.isUpperCase(str[i])) answer += Character.toLowerCase(str[i]);
            else answer += Character.toUpperCase(str[i]);
        }
        return answer;
    }
}