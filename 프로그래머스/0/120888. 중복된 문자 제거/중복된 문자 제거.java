import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] spl = my_string.split("");
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        
        for(String str : spl){
            lhs.add(str);
        }
        
        answer = String.join("",lhs);
        
        return answer;
    }
}