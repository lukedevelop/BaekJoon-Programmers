import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[42];
        int b = 42;

        for (int i = 0; i < 10; i++) {
            arr[sc.nextInt() % b] = true;
        }

        int cnt = 0;
        for (boolean value : arr) {
            if (value) {
                cnt++;
            }
        }
        System.out.println(cnt);



    }

}