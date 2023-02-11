import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = "abcdefghijklmnopqrstuwxyz";
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(!str.contains(my_string.charAt(i) + "")) {
                list.add(my_string.charAt(i) - '0');
            }
        }
        int[] answer = list.stream()
	        .mapToInt(Integer::intValue)
    	    .toArray();
        Arrays.sort(answer);
        return answer;
    }
}