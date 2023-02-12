class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = "";
        
        for(int n = i; n <= j; n++) {
            num += (n + "");
        }
        
        answer = num.length() - (num.replace(k + "", "")).length();
        
        return answer;
    }
}