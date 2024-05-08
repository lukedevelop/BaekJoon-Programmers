import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        sc.close();
        for (int i = 1; i <= num/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }

}