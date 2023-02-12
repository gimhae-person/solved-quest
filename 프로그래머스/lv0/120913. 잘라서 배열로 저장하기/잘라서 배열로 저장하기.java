class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        
        if(my_str.length() % n == 0) {
            length = my_str.length() / n;
        } else length = my_str.length() / n + 1;
        
        String[] answer = new String[length];
    
        int idx1 = 0;
        int idx2 = n;
        for(int i = 0; i < length; i++) {
            if(idx2 >= my_str.length()) {
                answer[i] = my_str.substring(idx1, my_str.length());
            } else answer[i] = my_str.substring(idx1, idx2);
            idx1 += n;
            idx2 += n;
        }
        return answer;
    }
}