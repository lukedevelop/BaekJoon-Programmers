import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split("");

        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]);
            if (i % 10 == 9) {
                System.out.println();
            }
        }


    }
}