class Solution {
    public int solution(int num) {
        int answer = 0;
        
        
        while(num != 1) {
            if(answer == 500) return -1;
            else if (num % 2 == 1) {
                num = num * 3 + 1;
            } else {
                num /= 2;
            }
            answer++;
        }        
        return answer;
    }
}