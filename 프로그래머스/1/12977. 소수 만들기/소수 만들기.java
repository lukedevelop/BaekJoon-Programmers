class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j ++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(is_prime(sum)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean is_prime(int sum){
        if(sum == 2) return true;
        
        for(int i = 2; i <= (int)Math.sqrt(sum); i++){
            if(sum % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
}