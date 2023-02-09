import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        String answer = Arrays.stream(arr)
            .distinct()
            .collect(Collectors.joining());   
        return answer;
    }
}