import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = 0;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        for(int k = 0; k < m; k++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while(i < j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}