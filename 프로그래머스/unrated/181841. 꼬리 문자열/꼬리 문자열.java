class Solution {
    public String solution(String[] str_list, String ex) {
        
        int count = 0;
        for(String x : str_list) {
            if(x.contains(ex)) count++;
        }
        
        String[] arr = new String[str_list.length - count];
        int idx = 0;
        
        for(int i=0; i<str_list.length; i++) {
            if(!str_list[i].contains(ex)) {
                arr[idx++] = str_list[i];
            }
        }
        String answer = String.join("", arr);
        
        return answer;
    }
}