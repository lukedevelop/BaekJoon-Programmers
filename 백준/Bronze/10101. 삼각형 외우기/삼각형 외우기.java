import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int tot = a + b + c;

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        }


        if (tot == 180) {

            if (a == b && a != c && b != c) {
                System.out.println("Isosceles");
            } else if (b == c && b != a && c != a) {
                System.out.println("Isosceles");
            } else if (a == c && a != b && c != b) {
                System.out.println("Isosceles");
            }

            if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            }


        }else {
            System.out.println("Error");
        }
    }

}