class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s = String.valueOf(num);
        boolean found = false;
        
       for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) - '0' == k){
                found = true;
                answer = i + 1;
                break;
            }
        }

        if(!found){
            answer = -1;
        }
        
        return answer;
    }
}