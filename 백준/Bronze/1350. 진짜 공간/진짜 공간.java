import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long tot = 0;
        double res = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

            double disc = sc.nextInt();

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= 0) {
                    res = Math.ceil(arr[j] / disc);
                    tot += (int)res * disc;
                }

            }

        System.out.println(tot);

    }
}