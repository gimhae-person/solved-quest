class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        
        while(chicken > 0) {
            coupon++;
            chicken--;
            if(coupon % 10 == 0) coupon++;
        }
        
        answer = coupon / 10;
        
        return answer;
    }
}