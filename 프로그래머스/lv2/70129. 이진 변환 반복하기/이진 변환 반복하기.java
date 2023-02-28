class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int length = s.length();
        int cnt1 = 0;
        int cnt2 = 0;

        while(!s.equals("1")) {
            s = s.replaceAll("0", "");
            cnt2 += length - s.length();
            length = s.length();
            cnt1++;
            s = Integer.toString(length, 2);
            length = s.length();
        }
        
        answer[0] = cnt1;
        answer[1] = cnt2;
        
        return answer;
    }
}