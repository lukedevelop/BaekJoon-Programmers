import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int y = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 9; j++) {
                y += sc.nextInt();
                k += sc.nextInt();
            }

            if (y > k) {
                System.out.println("Yonsei");
            }else if (y < k) {
                System.out.println("Korea");
            } else{
                System.out.println("Draw");
            }

        }
    }

}