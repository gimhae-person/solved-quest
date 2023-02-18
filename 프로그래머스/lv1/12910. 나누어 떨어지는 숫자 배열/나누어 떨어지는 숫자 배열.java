import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int n = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) n++;
        }
        
        if(n == 0) return new int[]{-1};
        
        int[] answer = Arrays.stream(arr).filter(num -> num % divisor == 0).sorted().toArray();
        return answer;
    }
}