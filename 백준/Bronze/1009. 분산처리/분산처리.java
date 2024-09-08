import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = 1;
			
			for(int j = 0; j < b; j++) {
				res = (res * a) % 10;
				
				if(res == 0) {
					res = 10;
				}
			}
		
			System.out.println(res);
		}
	
 }
}