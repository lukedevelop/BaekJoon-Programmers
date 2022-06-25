import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
//		int [] aa = {1,8};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
		for(int i = 0; i < num; i++) {
		int nums = sc.nextInt();
		arr.add(nums);
		}
		
		
		
		arr.sort(null);
		
		
		System.out.print(arr.get(0)+" "+arr.get(arr.size()-1));
	
		
	}

}
