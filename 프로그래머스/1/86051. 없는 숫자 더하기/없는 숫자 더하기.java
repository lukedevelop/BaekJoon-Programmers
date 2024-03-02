class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] answ = new int[10];
        for (int i = 0; i < numbers.length; i++) {
                answ[numbers[i]] = 1;
            }
        
        for (int j = 0; j < answ.length; j++) {
            if (answ[j] == 0) {
                answer += j;
            }
        }
        return answer;
    }
}