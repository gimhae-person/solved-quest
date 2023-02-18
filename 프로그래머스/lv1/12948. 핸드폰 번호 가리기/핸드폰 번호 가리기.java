class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "*";
        answer = star.repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4, phone_number.length());
        return answer;
    }
}