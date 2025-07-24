import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        int[] res = new int [arr.length];

        for(int i = 0; i < arr.length; i++){
            int[] chk = new int[arr.length];
            chk[i] = sc.nextInt();
            res[i] = arr[i] - chk[i];
            System.out.print(res[i]+" ");
        }
        sc.close();
        
    }

}