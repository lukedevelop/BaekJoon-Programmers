import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ls = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            String sub = intStrs[i].substring(s, s+l);
            int num = Integer.parseInt(sub);

            if(num > k){
                ls.add(num);
            }
        }
        
        int[] answer = new int[ls.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ls.get(i);
        }
        
        return answer;
    }
}