import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[101];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if (arr[m]) {
                cnt++;
            } else {
                arr[m] = true;
            }
        }

        System.out.println(cnt);



    }
}