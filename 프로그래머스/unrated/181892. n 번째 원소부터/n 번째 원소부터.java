import java.util.ArrayList;
import java.util.List;

class Solution {
    public Integer[] solution(int[] num_list, int n) {
        Integer[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=n; i<=num_list.length; i++) {
            list.add(num_list[i-1]);
        }
        
        answer = list.toArray(new Integer[0]);
        
        return answer;
    }
}