import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);

        int sum = sides[0] + sides[1];
    
        if(sum > sides[2]){
            answer = 1;
        } else{
            answer = 2;
        }
        return answer;
    }
}