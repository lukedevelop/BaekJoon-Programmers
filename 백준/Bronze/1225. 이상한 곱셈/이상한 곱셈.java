import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        String[] split = str.split("");
        String[] split2 = str2.split("");


        long res = 0;
        for (int i = 0; i < split.length; i++) {
            int a, b = 0;
            for (int j = 0; j < split2.length; j++) {
                a = Integer.parseInt(split[i]);
                b = Integer.parseInt(split2[j]);
                res += a * b;

            }
        }
        System.out.println(res);
    }

}