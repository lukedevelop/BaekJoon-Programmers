import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        while(order > 0){
            list.add(order % 10);
            order /= 10;
        }
        
       for(int i = 0; i < list.size(); i++){
           if(list.get(i) == 3){
               answer++;
           }else if(list.get(i) == 6){
               answer++;
           }else if(list.get(i) == 9){
               answer++;
           }
       }
        
        return answer;
    }
}