import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        int[] burger = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int[] drink = {sc.nextInt(), sc.nextInt()};

        int m = 0;
        for (int j = 0; j < burger.length; j++) {

            for (int k = 0; k < drink.length; k++) {
                arr[m] = (burger[j] + drink[k]) - 50;
                   m++;
            }
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}