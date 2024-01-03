class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String first = Integer.toString(a);
        String second = Integer.toString(b);
        
        int num1 = Integer.parseInt(first+second);
        int num2 = Integer.parseInt(second+first);
        
        answer = (num1 >= num2) ? num1 : num2;
        return answer;
    }
}