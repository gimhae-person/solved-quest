class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        
        for(int i = code; i <= str.length; i+=code) {
            answer += str[i - 1];
        }
        return answer;
    }
}