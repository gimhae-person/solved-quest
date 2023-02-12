class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = "";
        
        for(int n = i; n <= j; n++) {
            num += (n + "");
        }
        
        for(int idx = 0; idx < num.length(); idx++) {
            if((num.charAt(idx) + "").equals(k + "")) answer++;
        }
        
        return answer;
    }
}