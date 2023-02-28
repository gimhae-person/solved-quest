class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int length = s.length();
        
        while(!s.equals("1")) {
            s = s.replaceAll("0", "");
            answer[1] += length - s.length();
            length = s.length();
            answer[0]++;
            s = Integer.toString(length, 2);
            length = s.length();
        }       
        return answer;
    }
}