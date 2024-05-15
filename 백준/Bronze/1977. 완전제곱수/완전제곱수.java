import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            int res = 0;
            res = (int)Math.pow(i, 2);
            for (int j = m; j <= n; j++) {
                if (res == j) {
                    min = Math.min(j, min);
                    sum += j;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }


    }

}