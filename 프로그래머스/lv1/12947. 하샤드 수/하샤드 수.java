class Solution {
    public boolean solution(int x) {
        int i = x;
        int y = 0;
        
        while(x > 0) {
            y += (x % 10);
            x /= 10;
        }
        return (i % y == 0);
    }
}