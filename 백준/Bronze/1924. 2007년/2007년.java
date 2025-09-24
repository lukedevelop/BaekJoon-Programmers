import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m = sc.nextInt();
        int d = sc.nextInt();

        int answer = 0;
        for(int i = 0; i < m - 1; i++){
            answer += month[i];

        }

        answer += d - 1;

        System.out.println(days[answer % 7]);

    }

}