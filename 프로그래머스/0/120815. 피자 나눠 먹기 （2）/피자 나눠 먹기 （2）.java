class Solution {
    public int solution(int n) {
        int answer = 1;
        int chk = 6;
        
        while(chk % n != 0){ 
            chk += 6;
            answer++;
        }
        
        return answer;
    }
}
