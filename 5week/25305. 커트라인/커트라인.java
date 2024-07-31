import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] inputNum = new int[n];
		
		for(int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			inputNum[i] = x;
			
		}
		
		Arrays.sort(inputNum);
		System.out.println(inputNum[n-k]);
	
	}

}
