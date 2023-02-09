import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) answerList.add(i);
        }
        int [] answer = answerList.stream().mapToInt(number -> number).toArray();
                
        return answer;
    }
}