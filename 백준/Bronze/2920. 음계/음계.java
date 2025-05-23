import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[8];
		
		
		for(int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
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
		
		
	}

}