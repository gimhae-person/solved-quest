import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        int x = Arrays.asList(seoul).indexOf("Kim");
        
        String answer = "김서방은 " + x + "에 있다";
        return answer;
    }
}