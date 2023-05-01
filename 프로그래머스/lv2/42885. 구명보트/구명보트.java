import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int weight = 0;
        
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        
        while(i <= j) {
            weight = people[i] + people[j];
            if(weight <= limit) {
                answer++;
                i++;
                j--;
                weight = 0;
            } else {
                answer++;
                j--;
                weight = 0;
            } 
        }
        
        return answer;
    }
}