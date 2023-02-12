class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String n = num + "";
        
        if(n.contains(k + "")) {
            answer = n.indexOf(k + "") + 1;    
        }
        
        return answer;
    }
}