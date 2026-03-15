class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int[] cnt = new int[31];
        
        for(String str : strArr){
            cnt[str.length()]++;
        }
        
        for(int n : cnt){
            max = Math.max(max, n);
        }
        
            
        return max;
    }
}