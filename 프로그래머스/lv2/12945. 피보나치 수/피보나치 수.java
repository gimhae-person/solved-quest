class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        int cnt = 1;
        
        while(cnt != n) {
            c = b;
            b = (a+b) % 1234567;
            a = c % 1234567;
            answer = b % 1234567;
            cnt++;
        }        
        return answer;
    }
}