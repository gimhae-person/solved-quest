class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 1; i <= yellow; i++) {
            if((brown + yellow) / (i + 2) == (yellow / i) + 2 && yellow % i == 0) {
                if(brown + yellow == ((brown + yellow) / (i + 2)) * (i + 2)) {
                    answer[0] = (brown + yellow) / (i + 2);
                    answer[1] = i + 2;
                    break;    
                }
            }
        }
        return answer;
    }
}