class Solution {
    public int solution(int a, int b) {
       
        
        String ab = String.valueOf(a) + String.valueOf(b);
        int sum = 2 * a * b;
        
        if(Integer.parseInt(ab) >= sum){
            return Integer.parseInt(ab);
        }else{
            return sum;
        }
        
    }
}