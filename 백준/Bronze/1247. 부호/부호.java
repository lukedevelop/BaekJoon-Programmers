import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();

            BigInteger y = BigInteger.ZERO;
            for (int j = 0; j < x; j++) {
                y = y.add(sc.nextBigInteger());
            }

            if (y.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (y.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println(0);
            }

        }
        sc.close();

    }
}