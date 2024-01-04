class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for(int i = 0; i<num_list.length; i+=2) {
            odd += num_list[i];
            if(i+1 < num_list.length) {
            even += num_list[i+1];
            }
        }
        answer = odd > even ? odd : even;
        return answer;
    }
}