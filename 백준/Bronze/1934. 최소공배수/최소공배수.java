import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = gcdget(a,b);

            System.out.println((a*b) / gcd);
        }

    }

    static int gcdget(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcdget(b, a % b);
    }
}