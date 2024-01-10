class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if((byte)arr[i] <= 108) {
                arr[i] = 'l';
            }
        }
        answer = new String(arr);
        
        return answer;
    }
}