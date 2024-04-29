import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] arr = new String[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.next();
        }
        String res1 = arr[0] + arr[1];
        String res2 = arr[2] + arr[3];
        System.out.println(Long.parseLong(res1) + Long.parseLong(res2));
    }

}