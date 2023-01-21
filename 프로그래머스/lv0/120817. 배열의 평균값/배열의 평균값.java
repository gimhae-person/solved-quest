class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int cnt = 0;
        for(int num : numbers) {
            sum += num;
            cnt++;
        }
        answer = (double)sum / cnt;
        return answer;
    }
}