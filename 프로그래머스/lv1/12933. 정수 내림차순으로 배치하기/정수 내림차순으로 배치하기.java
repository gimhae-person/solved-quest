import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        
        while(n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        long[] arr = list.stream().mapToLong(num -> num).toArray();
        Arrays.sort(arr);
        
        for(int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i] * (Math.pow(10, i));
        }
        
        return answer;
    }
}