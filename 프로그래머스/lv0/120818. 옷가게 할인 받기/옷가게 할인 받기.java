class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000) {
            answer = (int)((double)price * 0.95);
            if(price >= 300000) {
                answer = (int)((double)price * 0.9);
                if(price >= 500000) answer = (int)((double)price * 0.8);
            }
        } else answer = price;
        return answer;
    }
}