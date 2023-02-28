import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        
        for(int i = 1; i <= balls; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        
        for(int j = 1; j <= share; j++) {
            b = b.multiply(BigInteger.valueOf(j));
        }
        
        for(int k = 1; k <= balls-share; k++) {
            c = c.multiply(BigInteger.valueOf(k));
        }
        
        answer = a.divide(b.multiply(c)).intValue();
        
        return answer;
    }
}