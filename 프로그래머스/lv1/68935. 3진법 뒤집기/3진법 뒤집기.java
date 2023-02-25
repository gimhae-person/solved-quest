class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n,3));
        String num = sb.reverse().toString();
        int answer = Integer.parseInt(num,3);
        return answer;
    }
}