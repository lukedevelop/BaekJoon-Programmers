class Solution {
    public String solution(String my_string) {
        String[] arr = {"a","e","i","o","u"};
        String[] strr = my_string.split("");

        String answer = "";

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < strr.length; j++){
                if(arr[i].equals(strr[j])){
                    strr[j] = "";
                }
            }
        }
        
        for(int i = 0; i < strr.length; i++){
            answer += strr[i];
        }
        
        return answer;
    }
}