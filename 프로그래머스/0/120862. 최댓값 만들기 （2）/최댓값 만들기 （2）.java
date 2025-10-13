import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int res1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int res2 = numbers[0] * numbers[1];
        
        
        return res1 > res2 ? res1 : res2;
    }
}