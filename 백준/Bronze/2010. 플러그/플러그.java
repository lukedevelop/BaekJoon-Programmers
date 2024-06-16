import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int chk = 0;
        int tot = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            chk += arr[i];
            tot = chk - i;
        }
        System.out.println(tot);

    }

}