
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] numArr = new int[n];
		
		for (int a=0; a<m; a++) {
			
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for (int b=i-1; b<=j-1; b++) {
				numArr[b] = k;
			}
		}
		
		sc.close();
		
		for(int c=0; c<numArr.length; c++)
		{
			System.out.print(numArr[c]+" ");
		}

	}

}

