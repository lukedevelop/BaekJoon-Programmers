import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            String[] split = str.split(",");

            for (int j = 0; j < split.length; j++) {
                arr[i] = res += Integer.parseInt(split[j]);
            }
            res = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}