import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int t = 0;
        int f = 0;
        for (int i = 0; i < n; i++) {

            int person = Integer.parseInt(br.readLine());

            if (person == 0) {
                f++;
            }
            if (person == 1){
                t++;
            }

        }

        if (f < t) {
            System.out.println("Junhee is cute!");
        } else{
            System.out.println("Junhee is not cute!");
        }

    }

}