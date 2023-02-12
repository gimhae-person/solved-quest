class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        
        for(int i = 1; i < str.length; i++) {
            if(!str[i - 1].equals("Z") && !str[i].equals("Z")) {
                answer += Integer.parseInt(str[i-1]);
            }   
        }
        if(!str[str.length - 1].equals("Z")) {
            answer += Integer.parseInt(str[str.length - 1]);
        }        
        return answer;
    }
}