import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int arr[] = {a, b, c};
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}