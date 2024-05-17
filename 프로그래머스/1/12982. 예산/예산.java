import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int res = 0;
        
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            res += d[i];
            if (res <= budget){
                answer++;
            }
        }
        
        return answer;
    }
}