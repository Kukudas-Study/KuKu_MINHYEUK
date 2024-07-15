import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp;
		
		int[] inputArr = new int[n];
		
		// 바구니 숫자 설정
		for (int a=0; a<n; a++) {
			inputArr[a]= a+1;
		}
		
		for (int b=0; b<m; b++) {
			
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			for (int k=0; k<(j-i)/2+0.1; k++) {
				
				temp = inputArr[i+k];
				inputArr[i+k] = inputArr[j-k];
				inputArr[j-k] = temp;
			}
		}
		
		for (int l=0; l<n; l++) {
			
			System.out.print(inputArr[l]+" ");
		}
		
	
	}

}

