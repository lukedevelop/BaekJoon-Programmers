import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split("");
        Arrays.sort(split, Collections.reverseOrder());

        for (int i = 0; i < split.length; i++) {
            System.out.print(Integer.parseInt(split[i]));
        }

    }
}