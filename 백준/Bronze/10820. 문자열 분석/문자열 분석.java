import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String s;

        while ((s = br.readLine()) != null) {
            char[] chars = s.toCharArray();

            int small = 0;
            int big = 0;
            int num = 0;
            int space = 0;


            for (char a : chars) {

                if (Character.isLowerCase(a)) {
                    small++;
                }
                if (Character.isUpperCase(a)) {
                    big++;
                }
                if (Character.isDigit(a)) {
                    num++;
                }

                if (a == ' ') {
                   space++;
                }
            }
            sb.append(small + " " + big + " " + num + " " + space + "\n");
        }

        System.out.print(sb);



    }

}