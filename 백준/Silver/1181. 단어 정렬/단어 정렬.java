import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] store = new String[num];

        sc.nextLine();

        for (int i = 0; i < num; i++) {
            store[i] = sc.nextLine();
        }

        Arrays.sort(store, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }else {
                    return o1.length() - o2.length();
                }

            }
        });

        System.out.println(store[0]);

        for (int i = 1; i < num; i++) {
            if (!store[i].equals(store[i - 1])) {
                System.out.println(store[i]);
            }
        }

    }
}