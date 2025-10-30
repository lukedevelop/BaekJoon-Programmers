class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String res = myString.replace("A","X").replace("B","A").replace("X","B");
        
        if(res.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}