import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String chk = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            chk = chk + str.charAt(i);
        }

        if (str.equals(chk)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
}

