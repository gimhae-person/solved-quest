class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += "수박";
        }
        answer = answer.substring(0, answer.length()/2);
        return answer;
    }
}