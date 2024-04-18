import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] chk = {"pi", "ka", "chu"};

        int res = 0;
        while (true) {
            for (int i = 0; i < chk.length; i++) {

                if (str.indexOf(chk[i]) == 0) {
                    str = str.substring(chk[i].length());
                    res = 1;
                }

            }
            if(res == 0) break;

            res = 0;
        }

        if (str.equals("")) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}