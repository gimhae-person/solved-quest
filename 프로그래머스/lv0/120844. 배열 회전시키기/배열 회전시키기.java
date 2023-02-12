class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        for(int i = 1; i < numbers.length - 1; i++) {
            if(direction.equals("left")) {
                answer[0] = numbers[1];
                answer[numbers.length - 1] = numbers[0];
                answer[i] = numbers[i + 1];
            } else {
                answer[0] = numbers[numbers.length - 1];
                answer[numbers.length - 1] = numbers[numbers.length - 2];
                answer[i] = numbers[i - 1];
            }
        }
        
        return answer;
    }
}