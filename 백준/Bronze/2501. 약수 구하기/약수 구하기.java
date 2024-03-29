import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int[] arr = new int[num];
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr[cnt++] = i;
            }
        }

        System.out.println(arr[num2 - 1]);
    }
}