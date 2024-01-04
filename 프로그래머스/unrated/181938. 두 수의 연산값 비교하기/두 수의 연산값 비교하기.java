class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int second_result = 2*a*b;
        
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        int first_result = Integer.parseInt(str_a+str_b);
        
        answer = first_result >= second_result ? first_result : second_result;
        return answer;
    }
}