import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = n;
        String num = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') cnt++;
        }
        
        String num2 = "";
        int cnt2 = 0;
        
        while(true) {
            answer++;
            num2 = Integer.toBinaryString(answer);
            for(int i = 0; i < num2.length(); i++) {
                if(num2.charAt(i) == '1') cnt2++;
            }     
            if(cnt2 != cnt) cnt2 = 0;
            else break;
        }
        
        return answer;
    }
}

