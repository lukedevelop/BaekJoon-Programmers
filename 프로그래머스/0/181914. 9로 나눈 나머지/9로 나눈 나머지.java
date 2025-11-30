class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] spl = number.split("");
        
        for(String s : spl){
            sum += Integer.parseInt(s);
        }
        
        int answer = sum % 9;
        
        
        return answer;
    }
}