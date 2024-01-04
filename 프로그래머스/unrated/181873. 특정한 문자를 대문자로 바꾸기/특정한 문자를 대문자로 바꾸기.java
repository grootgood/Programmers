class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string;
        String[] str = answer.split("");
        
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(alp)) {
                str[i] = str[i].toUpperCase();
            }
        }
        answer = String.join("",str);
        return answer;
    }
}