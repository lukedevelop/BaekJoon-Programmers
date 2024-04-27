import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < num; j++) {
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            String[] split = reverse.split(" ");

            for (int i = split.length - 1; i >= 0; i--) {
                System.out.print(split[i]);
                if (i > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        sc.close();

    }

}