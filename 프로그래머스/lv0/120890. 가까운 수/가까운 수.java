import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for(int i = 1; i < array.length; i++) {
            if(Math.abs(n - array[i]) < Math.abs(n - answer)) {
                answer = array[i];
            }
            else if(Math.abs(n - array[i]) == Math.abs(n - answer)) {
                if(array[i] < answer) answer = array[i];
            }
        }
        return answer;
    }
}