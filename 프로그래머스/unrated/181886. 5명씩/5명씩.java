class Solution {
    public String[] solution(String[] names) {
        int arraySize = (names.length / 5) + (names.length % 5 != 0 ? 1 : 0);
        String[] answer = new String[arraySize];
        int idx = 0;

        for (int i = 0; i < names.length; i += 5) {
            if (idx < answer.length) {
                answer[idx++] = names[i];
            }
        }

        return answer;
    }
}