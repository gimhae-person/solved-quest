class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / i;
            }
        }
        return answer;
    }
}