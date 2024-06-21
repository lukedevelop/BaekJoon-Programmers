class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] split = my_string.split("");

        for (int i = 0; i < split.length; i++) {

            if (split[i].toLowerCase().equals(split[i])) {
                answer += split[i].toUpperCase();
            } else{
                answer += split[i].toLowerCase();
            }
        }
        
        return answer;
    }
}