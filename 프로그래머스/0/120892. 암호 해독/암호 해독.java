class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] split = cipher.split("");
        
        for(int i = 1; i <= split.length / code; i++){
            answer += split[code*i-1]; 
        }
        
        return answer;
    }
}