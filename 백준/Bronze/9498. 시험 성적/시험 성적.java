import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int jum = sc.nextInt();
		
		if(jum >= 90) {
			System.out.println("A");
		}else if(jum >= 80) {
			System.out.println("B");
		}else if(jum >= 70) {
			System.out.println("C");
		}else if(jum >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}