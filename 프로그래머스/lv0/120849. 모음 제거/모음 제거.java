class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = "aeiou";
        for(int i = 0; i < my_string.length(); i++) {
            if(!str.contains(my_string.charAt(i) + "")) answer += my_string.charAt(i);
        }
        return answer;
    }
}