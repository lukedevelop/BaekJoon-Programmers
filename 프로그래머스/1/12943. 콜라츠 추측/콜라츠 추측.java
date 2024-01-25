class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long) num;
        int cnt = 0;
        
         while (n > 0) {

            if (n == 1) {
                answer = 0;
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
                cnt++;
            } else {
                n = n * 3 + 1;
                cnt++;
            }

            if (n == 1) {
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