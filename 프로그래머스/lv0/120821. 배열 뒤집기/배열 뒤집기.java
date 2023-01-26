class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int x = 0;
        
        for (int i : num_list) {
            x++;
            answer[num_list.length - x] = i;
        }
        return answer;
    }
}