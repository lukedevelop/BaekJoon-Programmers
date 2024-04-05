import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        int min = Integer.MAX_VALUE;
        int tot = 0;

        for (int i = 0; i < n; i++) {


            for (int j = 0; j < 7; j++) {
                arr[j] = sc.nextInt();

                if (arr[j] % 2 == 0) {
                    tot += arr[j];
                    if (arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
            System.out.println(tot +" " + min);
            tot = 0;
            min = Integer.MAX_VALUE;
        }
        sc.close();


    }
}