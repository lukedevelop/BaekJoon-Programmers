import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 2 * num; i++) {

            if (i % 2 == 1) {
                for (int j = 1; j <= num; j++) {
                    if (j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }else {
                for (int j = 1; j <= num; j++) {
                    if (j % 2 == 1) {
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");

        }
    }
}