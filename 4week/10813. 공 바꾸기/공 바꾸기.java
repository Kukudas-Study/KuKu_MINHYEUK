import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] inputArr = new int[n];
		

		for (int k = 0; k < n; k++) {
			inputArr[k] = k+1;
		}
		
		for (int k = 0; k < m; k++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int temp = 0;
			temp = inputArr[i];
			inputArr[i] = inputArr[j];
			inputArr[j] = temp;
			
		}
		
		sc.close();
		for (int k = 0; k < n; k++) {
			System.out.print(inputArr[k] + " ");
		}
		

	}

}
