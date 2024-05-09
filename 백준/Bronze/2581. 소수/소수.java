import java.util.Scanner;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        prime = new boolean[n + 1];
        make_prime(n);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if (prime[i] == false) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    public static void make_prime(int num) {
        
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }


    }

}




