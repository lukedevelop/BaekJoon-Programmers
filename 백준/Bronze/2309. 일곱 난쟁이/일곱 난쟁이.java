import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int tot = 0;

		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			tot += arr[i];
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(tot - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					
					Arrays.sort(arr);
					for(int k = 2; k < 9; k++) {
						System.out.println(arr[k]);
					}
					return;
				}
				
			}
		}

	}
}