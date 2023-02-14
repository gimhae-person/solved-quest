class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        long num = 0;
        while(num != (long)n * (long)x) {
            num += (long)x;   
            answer[idx] = num;
            idx++;
        }
        return answer;
    }
}