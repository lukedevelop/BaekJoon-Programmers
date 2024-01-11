import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int num1 = sc.nextInt();
            int total1 = 0;
            for (int j = 0; j < num1; j++) {

                total1 += sc.nextInt();
            }
            System.out.println(total1);
        }

    }

}