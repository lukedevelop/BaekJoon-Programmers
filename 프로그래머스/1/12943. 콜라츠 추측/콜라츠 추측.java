class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        
         while (num > 0) {

            if (num == 1) {
                answer = 0;
                break;
            }

            if (num % 2 == 0) {
                num = num / 2;
                cnt++;
            } else {
                num = num * 3 + 1;
                cnt++;
            }

            if (num == 1) {
                answer = cnt;
                break;
            }
            if (cnt >= 500) {
                answer = -1;
                break;
            }

        }
        return answer;
    }
}