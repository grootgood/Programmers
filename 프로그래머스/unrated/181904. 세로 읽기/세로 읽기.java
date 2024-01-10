class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] arr = new String[my_string.length()/m][m];
        String[] arr2 = new String[my_string.length()/m];
        int index = 0;
        
        for(int i=0; i<my_string.length()/m; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = String.valueOf(my_string.charAt(index));
                index++;
            }
        }
        
        for(int i=0; i<my_string.length()/m; i++) {
            arr2[i] = arr[i][c-1];
        }
        answer = String.join("", arr2);
        return answer;
    }
}