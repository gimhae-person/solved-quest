class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p = 0; 
        int y = 0;
        
        for(int i = 0 ; i < s.length(); i++) {
            if((s.charAt(i) + "").equals("p") || (s.charAt(i) + "").equals("P")) p++;
            else if((s.charAt(i) + "").equals("y") || (s.charAt(i) + "").equals("Y")) y++;
        }
        
        if((p == 0 && y == 0) || p == y)  answer = true;
        
        return answer;
    }
}