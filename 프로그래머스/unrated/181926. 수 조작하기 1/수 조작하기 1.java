class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] arr = control.split("");
        
        for(String s: arr) {
            switch(s) {
                case "w":
                    n+=1;
                    break;
                case "s":
                    n-=1;
                    break;
                case "d":
                    n+=10;
                    break;
                default:
                    n-=10;
                }
        }
        answer = n;
        return answer;
    }
}