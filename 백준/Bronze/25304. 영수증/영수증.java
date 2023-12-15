import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        int ea = sc.nextInt();
        int sum = 0;
        int a,b;

        for (int i = 1; i <= ea; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a * b;
        }
        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}