class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        if(arr.length % 2 != 0) {
            for(int i=0; i<arr.length; i=i+2) {
                arr[i] += n;
                answer[i] = arr[i];
            }
        } else {
            for(int i=1; i<arr.length; i=i+2) {
                arr[i] += n;
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}