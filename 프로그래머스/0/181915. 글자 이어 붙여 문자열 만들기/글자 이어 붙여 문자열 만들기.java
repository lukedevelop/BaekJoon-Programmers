class Solution {
    public String solution(String my_string, int[] index_list) {
       
        
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < index_list.length; i++){
            sb.append(chars[index_list[i]]);
        }
        
         String answer = sb.toString();
        
        return answer;
    }
}