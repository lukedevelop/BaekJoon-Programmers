
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt();
		int A = sc.nextInt();
		
		if(A > B) {
			System.out.println("<");
		}else if(A < B) {
			System.out.println(">");
		}else if(A == B) {
			System.out.println("==");
		}
		
		
	}

}
