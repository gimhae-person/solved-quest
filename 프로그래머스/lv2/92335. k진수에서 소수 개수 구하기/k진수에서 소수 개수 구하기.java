import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String strnum = Integer.toString(n, k); 
        String[] arr = strnum.split("0");
        
        boolean s = true;
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("1") && !arr[i].equals("")) {
                for(int j = 2; j < Math.sqrt(Long.parseLong(arr[i]) + 1); j++) {
                    if(Long.parseLong(arr[i]) % j == 0) {
                        s = false;
                        break;
                    }
                }
                if(s) {
                    answer++;
                    s = true;
                }
            }
        }  
        return answer;
    }
}