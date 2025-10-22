import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        int num = n;
        
        while(num != 1){
            list.add(num);
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = 3 * num + 1;
            }
        }
        
        list.add(1);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
             
        
        return answer;
    }
}