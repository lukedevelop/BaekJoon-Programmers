import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 <= 0 || num2 <= 0) {
                continue;
            }

            int gcd = getGCD(num1, num2);
            System.out.println((num1 * num2) / gcd);
            System.out.println( gcd);

        }
    }

    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }

}