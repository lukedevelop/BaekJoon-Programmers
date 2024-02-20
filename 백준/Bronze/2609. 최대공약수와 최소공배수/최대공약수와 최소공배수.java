import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = geGCD(num1, num2);

        System.out.println(gcd);
        System.out.println((num1 * num2) /gcd);

    }

    public static int geGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return geGCD(num2, num1 % num2);
    }

}