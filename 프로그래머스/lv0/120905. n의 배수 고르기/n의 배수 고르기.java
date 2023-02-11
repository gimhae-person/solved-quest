import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int sum = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) sum++;
        }
        
        int[] answer = new int[sum];
        int idx = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[idx] = numlist[i];
                idx++;
            }
        }
        return answer;
    }
}