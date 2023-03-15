class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                sum += j; 
                if(sum > n) break;
                else if(sum == n) {
                    answer++;
                    break;
                }
            }
            sum = 0;
        }
        return answer;
    }
}