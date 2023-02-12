import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0; i < str.length; i++) {
            numbers = numbers.replaceAll(str[i], number[i]);
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}