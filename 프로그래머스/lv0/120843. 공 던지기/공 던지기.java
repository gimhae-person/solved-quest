class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = 2 * (k - 1); 
        
        answer = numbers[n % numbers.length];
        
        return answer;
    }
}