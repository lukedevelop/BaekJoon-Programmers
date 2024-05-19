class Solution {
    public int solution(int n) {
        
        String res = Integer.toString(n, 3);

        String reverse = new StringBuilder(res).reverse().toString();

        int answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}