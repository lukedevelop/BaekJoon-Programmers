import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.next();
		}
		


		for(int i = 0; i < arr.length; i++ ) {
			int n = 0;
			int sum = 0;
						
			for(int j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					n++;
				}else {
					n = 0;
				}
				
				
				sum += n;
			}
			System.out.println(sum);
		}


	}
}