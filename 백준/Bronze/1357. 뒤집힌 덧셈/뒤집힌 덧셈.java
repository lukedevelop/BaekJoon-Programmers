import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int x = rev(num);
        int y = rev(num2);
        int res = rev(x + y);
        System.out.println(res);

    }

    private static int rev(int n) {
        int reserve = 0;
        while (n != 0) {
            int x = n % 10;
            reserve = reserve * 10 + x;
            n /= 10;
        }
        return reserve;
    }

}