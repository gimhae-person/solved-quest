import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] str = my_string.split("");
        for(int i = 0; i < str.length; i++) {
            if(!alphabet.contains(str[i])) answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}