class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "";
        String num2 = "";
        
        for(int x: num_list) {
            if(x % 2 != 0) {
                num1 += x;
            } else {
                num2 += x;
            }
        } 
        
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
}