class Solution {
    public String solution(int age) {
        String answer = "";
        String strage = age + "";
        String alphabet = "abcdefghij";
        
        for(int i = 0; i < strage.length(); i++) {
            answer += alphabet.charAt(strage.charAt(i) - '0'); 
        }
        return answer;
    }
}