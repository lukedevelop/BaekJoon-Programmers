class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] split = s.toCharArray();
        
        int big = (int)'Z' - (int)'A' + 1;
        int small = (int)'z' - (int)'a' + 1;

        for (int i =0;i<split.length;i++)
        {
        if (split[i] != ' ') {
            if ((int)'Z' < ((int) split[i]) + n && (int)split[i] <=90) {
                split[i] = (char) (  ((int)split[i]) + n - big);
            }else if ((int)'z' < ((int) split[i]) + n){
                split[i] = (char) (  ((int)split[i]) + n - small);
            }else{
                split[i] = (char)(((int)split[i])+n);
            }
        }
            answer += split[i];

        }
        return answer;
    }
}