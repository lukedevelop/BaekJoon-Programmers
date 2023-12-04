import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 != num2 && num1 != num3 && num2 != num3) {
            int max;
            if (num1 > num2) {
                if (num3 > num1) {
                    max = num3;
                } else {
                    max = num1;
                }
            } else {
                if (num3 > num2) {
                    max = num3;
                } else {
                    max = num2;
                }
            }
            System.out.println(max * 100);
        } else {
            if (num1 == num2 && num1 == num3) {
                System.out.println(10000 + num1 * 1000);
            } else {
                if (num1 == num2 || num1 == num3) {
                    System.out.println(1000 + num1 * 100);
                } else {
                    System.out.println(1000 + num2 * 100);
                }
            }
        }


    }
}