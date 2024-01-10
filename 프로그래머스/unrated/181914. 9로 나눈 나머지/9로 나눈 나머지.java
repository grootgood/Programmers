class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int sum = 0;
        for(String x : arr) {
            sum += Integer.parseInt(x);
        }
        int answer = sum % 9;
        return answer;
    }
}