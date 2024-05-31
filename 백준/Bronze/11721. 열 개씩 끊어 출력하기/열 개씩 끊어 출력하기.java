import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}