import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < str.length; i++) {
            numbers = numbers.replaceAll(str[i], String.valueOf(i));
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}