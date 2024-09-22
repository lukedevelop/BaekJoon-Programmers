import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] cd_1 = {sc.nextInt(), sc.nextInt()};
		int[] cd_2 = {sc.nextInt(), sc.nextInt()};
		int[] cd_3 = {sc.nextInt(), sc.nextInt()};
		
		int x;
		int y;
		
		if(cd_1[0] == cd_2[0]) {
			x = cd_3[0];
		}else if(cd_1[0] == cd_3[0]) {
			x = cd_2[0];
		} else {
			x = cd_1[0];
		}
		
		if(cd_1[1] == cd_2[1]) {
			y = cd_3[1];
		}else if(cd_1[1] == cd_3[1]) {
			y = cd_2[1];
		}else {
			y = cd_1[1];
		}
		
		System.out.println(x + " " + y);
		
	}
}