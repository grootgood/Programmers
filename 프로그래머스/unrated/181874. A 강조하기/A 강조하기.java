class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("a") || str[i].equals("A")) {
                str[i] = str[i].toUpperCase();
            } else {
                str[i] = str[i].toLowerCase();
            }
        }
        answer = String.join("", str);
        
        return answer;
    }
}