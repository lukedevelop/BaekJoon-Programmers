class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        String res = "";
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 0){
                res = strArr[i].toLowerCase();
                answer[i] = res;
            }else{
                res = strArr[i].toUpperCase();
                answer[i] = res;
            }
        }
        
        return answer;
    }
}