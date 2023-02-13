import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer>list = new ArrayList<>();
        
        while(n > 0) {
            list.add(Long.valueOf(n % 10).intValue());
            n /= 10;
        }
        
        int[] answer = list.stream().mapToInt(num -> num).toArray();
        
        return answer;
    }
}