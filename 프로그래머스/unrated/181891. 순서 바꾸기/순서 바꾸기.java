class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        for(int i=0; i<answer.length; i++) {
            if(n < answer.length) {
                answer[i] = num_list[n++];
            }
            else {
                answer[i] = num_list[idx++];
            }
        }
        
        return answer;
    }
}