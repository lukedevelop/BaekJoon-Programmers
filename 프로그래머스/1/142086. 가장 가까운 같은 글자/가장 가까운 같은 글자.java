class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] split = s.split("");
        
        for(int i = 0; i < split.length; i++){
            int min = -1;
            
            for(int j = 0; j < i; j++){
                 if (split[i].equals(split[j])) {
                    min = 0;
                    min = i - j;
                }
            }
            answer[i] = min;
        }
        
        return answer;
    }
}