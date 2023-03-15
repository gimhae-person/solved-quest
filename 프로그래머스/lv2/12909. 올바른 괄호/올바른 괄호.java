class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        
        char[] arr = s.toCharArray();
        
        if(arr[0] == ')') answer = false;
        else cnt = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == '(') cnt++;
            else if(arr[i] == ')' && cnt != 0) cnt--;
        }
        
        if(cnt != 0) answer = false;
        
        return answer;
    }
}