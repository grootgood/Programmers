class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0, sum2 = 0;
        if(arr1.length > arr2.length) {
            answer = 1;
        }
        else if(arr1.length < arr2.length) {
            answer = -1;
        }
        else if(arr1.length == arr2.length) {
            for(int x: arr1) {
                sum1 += x;
            }
            for(int y: arr2) {
                sum2 += y;
            }
            if(sum1 > sum2) {
                answer = 1;
            }
            else if(sum1 < sum2) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}