class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 0) {
            if(hp >= 5){
                answer ++;
                hp = hp - 5;
            }
            else if(hp >= 3) {
                answer++;
                hp = hp - 3;
            }
            else if(hp >= 1) {
                answer++;
                hp = hp - 1;
            }
        }
        return answer;
    }
}