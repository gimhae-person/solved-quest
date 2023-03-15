import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            answer[i] = (score[i][0] + score[i][1]);
            arr[i] = (score[i][0] + score[i][1]);
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(answer[i] == arr[arr.length - j - 1]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }        
        
        return answer;
    }
}