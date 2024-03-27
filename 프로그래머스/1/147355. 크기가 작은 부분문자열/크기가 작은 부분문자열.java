class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        
        int pLength = p.length();
        for(int i = 0; i < t.length()-pLength+1; i++) {
            long num = Long.parseLong(t.substring(i, i+pLength)); 
            if(num <= pNum) {
                answer++;
            }
        }
            
        return answer;
    }
}