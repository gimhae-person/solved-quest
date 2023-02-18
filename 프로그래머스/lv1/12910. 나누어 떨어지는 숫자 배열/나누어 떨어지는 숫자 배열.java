import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.size() == 0) list.add(-1);
        
        int[] answer = list.stream().sorted().mapToInt(num -> num).toArray();
        return answer;
    }
}