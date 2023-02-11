class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        
        if(arr.length == 1) {
            int[] answer2 = {-1};
            return answer2;
        } else {
            int num = arr[0];
        
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] < num) {
                    num = arr[i];           
                }   
            }
            int idx = 0;
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != num) {
                    answer[idx] = arr[i];
                    idx++;
                }
            }
        }
        return answer;
    }
}