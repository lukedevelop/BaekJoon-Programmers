import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int a = t / 300;
		t %= 300;
		int b = t / 60;
		t %= 60;
		int c = t / 10;
		t %= 10;
		

		if(t != 0) {
			System.out.println(-1);
		}else {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	

	}
}