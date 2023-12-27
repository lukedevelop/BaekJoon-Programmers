import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String str = sc.nextLine();
        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i]);
            sum += a;
        }
        System.out.println(sum);
        
    }
}