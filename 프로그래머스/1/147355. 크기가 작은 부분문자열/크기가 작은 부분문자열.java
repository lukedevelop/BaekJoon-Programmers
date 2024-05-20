class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i = 0; i <= t.length() - p.length(); i++){
            String substring = t.substring(i, i+p.length());
            
             if (substring.compareTo(p) <= 0){
                answer++;
            }
        }
        return answer;
    }
}