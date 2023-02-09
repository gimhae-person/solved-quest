import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int size = before.length();
        
        String[] beforeStr = before.split("");
        String[] afterStr = after.split("");
        
        Arrays.sort(beforeStr);
        Arrays.sort(afterStr);
        
        for(int i = 0; i < size; i++) {
            if(!beforeStr[i].equals(afterStr[i])) answer = 0;
        }
        return answer;
    }
}