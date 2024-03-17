import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            boolean chk = true;
            int n = sc.nextInt();

            if (n == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    chk = false;
                    break;
                }
            }
            if (chk){
                count++;
            }

        }
        System.out.println(count);


    }

}