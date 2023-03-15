class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = dots[0][0];
        int b = dots[0][1];
        
        int c = 0;
        int d = 0;
        
        for(int i = 0; i < dots.length; i++) {
            if(dots[i][0] != a) {
                c = Math.max(dots[i][0], a) - Math.min(dots[i][0], a);
            }
            if(dots[i][1] != b) {
                d = Math.max(dots[i][1], b) - Math.min(dots[i][1], b);
            }
        }
        return c*d;
    }
}