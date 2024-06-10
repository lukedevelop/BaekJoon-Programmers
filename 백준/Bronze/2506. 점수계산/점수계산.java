import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int jum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int answer = sc.nextInt();

            if (answer == 1) {
                sum += answer + jum;
                jum++;
            }
            if (answer == 0) {
                jum = 0;
            }

        }

        System.out.println(sum);

    }

}