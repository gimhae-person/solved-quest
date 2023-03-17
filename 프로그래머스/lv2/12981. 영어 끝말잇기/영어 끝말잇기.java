class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        for(int i = 1; i < words.length; i++) {
            if(words[words.length - i - 1].charAt(words[words.length - i - 1].length() - 1) != words[words.length - i].charAt(0)) {
                answer[0] = (words.length - i) % n + 1;
                answer[1] = (words.length - i) / n + 1;
            } 
            for(int j = 1; j <= words.length - i; j++) {
                if(words[words.length - i].equals(words[words.length -i - j])) {  
                    answer[0] = (words.length - i) % n + 1;
                    answer[1] = (words.length - i) / n + 1;                   
                }
            }
        }

        return answer;
    }
}