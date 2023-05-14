import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        Arrays.sort(sizes[0]);
        int x = sizes[0][0];
        int y = sizes[0][1];
        
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if(sizes[i][0] > x) x = sizes[i][0];
            if(sizes[i][1] > y) y = sizes[i][1];
        } 
        answer = x * y;
        return answer;
    }
}