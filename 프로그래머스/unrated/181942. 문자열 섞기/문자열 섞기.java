class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        String[] str = new String[str1.length()];
        
        for(int i=0; i<arr1.length; i++) {
            str[i] = ""+arr1[i]+arr2[i];
        }
        answer = String.join("", str);
        return answer;
    }
}