class Solution {
    public int solution(String s) {
        String[] split = s.split("");
        String[] word = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int answer = 0;
        String res = "";
        String tot = "";
        
        
         for (int i = 0; i < split.length; i++) {
            res += split[i];

            for (int j = 0; j < word.length; j++) {

                if (res.equals(word[j])) {
                    tot += res.replaceAll(word[j], num[j]);
                    res = "";
                }

                if (res.equals(num[j])){
                    tot += num[j];
                    res = "";
                }

                }

            }
                answer = Integer.parseInt(tot);
        
        return answer;
    }
}