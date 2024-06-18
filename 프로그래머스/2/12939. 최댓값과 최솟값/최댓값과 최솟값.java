class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        int[] arr = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < split.length; i++) {

            if (max < arr[i]) {
                max = arr[i];

            }
            if (min > arr[i]) {
                min = arr[i];

            }
        }
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}