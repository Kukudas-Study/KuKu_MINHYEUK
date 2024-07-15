
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] inputArr = new int[n][m];
		int[][] inputArr2 = new int[n][m];
		
		for(int i=0;i<n;i++) {
			
			for(int j=0; j<m; j++) {
				
				inputArr[i][j] += sc.nextInt();
			}
			
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0; j<m; j++) {
				
				inputArr[i][j] += sc.nextInt();
			}
			
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0; j<m; j++) {
				
				System.out.print(inputArr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	
	}

}

