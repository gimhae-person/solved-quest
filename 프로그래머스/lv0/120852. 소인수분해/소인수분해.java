import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int i = 2;
        
        while(n >= 2) {
            if(n % i == 0){
                list.add(i);
                n = n / i;
            }
            else i++;
        }
        
        answer = list.stream().distinct().mapToInt(num -> num).toArray();
        
        return answer;
    }
}