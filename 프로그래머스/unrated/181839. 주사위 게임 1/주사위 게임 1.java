class Solution {
    public int solution(int a, int b) {
        int answer = (a % 2 != 0) && (b % 2 != 0) ? a*a+b*b : ( (a % 2 != 0) || (b % 2 != 0) ? 2*(a+b) : ( a>=b ? a-b : -(a-b) ));
        return answer;
    }
}