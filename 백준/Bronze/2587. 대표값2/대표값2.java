import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int res = 0;
        int[] arr = new int[5];


        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            res += arr[i];

        }
        Arrays.sort(arr);
        
        System.out.println(res / 5);
        System.out.println(arr[2]);
    }
}