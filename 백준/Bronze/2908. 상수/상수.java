import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String[] as = a.split("");
        String[] bs = b.split("");

        String resa = "";
        String resb = "";

        for (int i = as.length - 1; i >= 0; i--) {
            resa += as[i];
        }


        for (int i = bs.length - 1; i >= 0; i--) {
            resb += bs[i];
        }

        if (Integer.parseInt(resa) > Integer.parseInt(resb)) {
            System.out.println(resa);
        }else {
            System.out.println(resb);
        }
    }

}