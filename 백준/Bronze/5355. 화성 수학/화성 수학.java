import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] split = str.split(" ");


            double res = Double.parseDouble(split[0]);

            for (int j = 1; j < split.length; j++) {

                if (split[j].equals("@")) {
                    res *= 3;
                } else if (split[j].equals("%")) {
                    res += 5;
                } else if (split[j].equals("#")) {
                    res -= 7;
                }
            }

            System.out.printf("%.2f\n", res);
        }

    }

}