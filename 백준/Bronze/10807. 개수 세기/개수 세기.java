import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            arr[i] =sc.nextInt();
        }

        int chk = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == chk) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}