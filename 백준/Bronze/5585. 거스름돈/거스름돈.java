import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int money = 1000;
        int m = sc.nextInt();


        int tot = money - m;
        int change = 0;

        while (tot > 0){


            if (tot >= 500) {
                tot -= 500;
                change++;
            }
            else if (tot >= 100 && tot < 500) {
                tot -= 100;
                change++;
            }
            else if (tot >= 50 && tot < 100) {
                tot -= 50;
                change++;
            }
            else if (tot >= 10 && tot < 50) {
                tot -= 10;
                change++;
            }
            else if (tot >= 5 && tot < 10) {
                tot -= 5;
                change++;
            }
            else if (tot >= 1 && tot < 5){
                tot -= 1;
                change++;
            }

            if (tot == 0) {
                System.out.println(change);
                break;
            }

        }


    }

}




