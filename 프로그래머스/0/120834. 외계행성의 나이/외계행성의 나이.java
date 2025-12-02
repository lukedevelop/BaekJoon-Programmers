class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        String[] spl = String.valueOf(age).split("");
        
        for(int i = 0; i < spl.length; i++){
            answer+=arr[Integer.parseInt(spl[i])];
        }
        
        return answer;
    }
}