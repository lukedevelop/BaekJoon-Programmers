import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt()
        };
        sc.close();

        int max = 0;
        int index = 0;
        int cnt = 0;

        for (int value : arr) {
            cnt++;

            if (value > max) {
                max = value;
                index = cnt;
            }
        }
        System.out.println(max + "\n" + index);
    }
}