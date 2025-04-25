import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {

		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		for(int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean asc = true;
		boolean dsc = true;
		
		for(int i = 0; i < 7; i++) {
			if(arr[i+1] > arr[i]) {
				dsc = false;
			}else if(arr[i+1] < arr[i]) {
				asc = false;
			}
		}
		
		if(asc) {
			System.out.println("ascending");
		}else if(dsc) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
		sc.close();
		
	}

}
