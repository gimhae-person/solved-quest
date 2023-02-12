class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String n = num + "";
        
        for(int i = 0; i < n.length(); i++) {
            if((n.charAt(i) + "").equals(k + "")) answer = n.indexOf(k + "") + 1;
        }
        return answer;
    }
}