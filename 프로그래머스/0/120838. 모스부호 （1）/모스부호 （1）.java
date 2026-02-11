import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] spl = letter.split(" ");
        char[] arr = new char[26];
        String[] more = {".-","-...","-.-.","-..",".","..-.",
                         "--.","....","..",".---","-.-",".-..",
                         "--","-.","---",".--.","--.-",".-.","...",
                         "-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (char)('a'+i);
        }
        
        for(int i = 0; i < spl.length; i++){
            for(int j = 0; j < more.length; j++){
                if(spl[i].equals(more[j])){
                    answer+= arr[j];
                }
            }
        }
        
        
        return answer;
    }
}