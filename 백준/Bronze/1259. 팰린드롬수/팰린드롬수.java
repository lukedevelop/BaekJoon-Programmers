import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true){
            String str = sc.nextLine();

            if(str.equals("0")){
                break;
            }

            String reverse = new StringBuilder(str).reverse().toString();

            if(str.equals(reverse)){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }

            }

        }
}