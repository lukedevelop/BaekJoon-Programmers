class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("");
        
        for(int i = 0; i < split.length; i++){
            for(int j = 1; j <= 9; j++){
                if(split[i].equals(String.valueOf(j))){
                    answer += Integer.parseInt(split[i]);
                }
            }
        }
        return answer;
    }
}