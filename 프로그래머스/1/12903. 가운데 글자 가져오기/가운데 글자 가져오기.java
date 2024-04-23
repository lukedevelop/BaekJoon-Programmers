class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        
        int chk = split.length / 2;
        if (split.length % 2 != 0) {
            answer = split[chk];
            }
        if (split.length % 2 == 0) {
            answer = split[chk-1] + split[chk];
        }
        return answer;
    }
}