class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int n = array[0];
        for(int i = 1; i < array.length; i++) {
            if(n < array[i]) {
                n = array[i];
                answer[0] = n;
                answer[1] = i;
            }
        }
        return answer;
    }
}