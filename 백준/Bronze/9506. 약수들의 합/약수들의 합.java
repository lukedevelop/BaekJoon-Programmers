import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			if(N == -1){
				break;
            }
			
			int[] arr = new int[N]; 
			int res = 0;			
			int index = 0;			
			for(int i=1; i<N; i++) {
				if(N%i == 0) {		
					arr[index++] = i;	
					res += i;
				}
			}
			
			if(res != N) {
				System.out.println(N + " is NOT perfect.");
				continue;
			}
			
			System.out.print(N + " = ");
			for(int i=0; i<index; i++) {
				if(i == index-1)
					System.out.print(arr[i]);
				else
					System.out.print(arr[i] + " + ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}