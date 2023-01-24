class Solution {
    public int[] solution(int money) {
        int americano = money / 5500;
        int leftmoney = money % 5500;
        int[] answer = {americano, leftmoney};
        return answer;
    }
}