class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 1;
        int sum = 0;
        for(int x: num_list) {
            result *= x;
            sum += x;
        }
        sum = sum*sum;
        answer = result < sum ? 1 : 0;
        return answer;
    }
}