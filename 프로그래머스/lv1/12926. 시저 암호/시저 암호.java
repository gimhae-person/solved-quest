class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String bet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') answer += s.charAt(i);
            for(int j = 0; j < 26; j++) {
                if(s.charAt(i) == alpha.charAt(j)) {
                    if(j + n > 25) {
                        answer += alpha.charAt(j + n -26);
                    } else if(j + n < 26) answer += alpha.charAt(j + n);
                } else if(s.charAt(i) == bet.charAt(j)) {
                    if(j + n > 25) {
                        answer += bet.charAt(j + n - 26);
                    } else if(j + n < 26) answer += bet.charAt(j + n);
                }
            }
        }
        
        return answer;
    }
}