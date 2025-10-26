import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a,b;

        if(str.length() == 2){
            a = str.charAt(0) - '0';
            b = str.charAt(1) - '0';
        }else if(str.length() == 3){
            if(str.startsWith("10")){
                a = 10;
                b = str.charAt(2) - '0';
            }else{
                a = str.charAt(0) - '0';
                b = 10;
            }
        }else{
            a = 10;
            b = 10;
        }

        System.out.println(a + b);


    }
}