class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1; 
        while(num <= n) {
            num *= (answer + 1);
            answer++;
        }
        return answer - 1;
    }
}